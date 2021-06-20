package nIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		
		String fname = "D:\\Program Files\\PerScholas\\Week 3-Java\\Res\\file0.txt";
		
	    FileInputStream inputFile = new	FileInputStream(fname);
	   // RandomAccessFile inputFile = new RandomAccessFile(fname, "r");
	    	   
		 FileChannel inchanel =  inputFile.getChannel();
		
		 // intializing buffer,
		
		 //ByteBuffer bufferfile  =  ByteBuffer.allocate(200);
		
		  long filesize = inchanel.size();
		  ByteBuffer bufferfile  =  ByteBuffer.allocate( (int) filesize);
		 // read date from a channel into buffer
		 
		  @SuppressWarnings("unused")
		int byteReader =  inchanel.read(bufferfile);
		  bufferfile.flip();  // make buffer ready for read
		 
		  for(int i = 0; i < filesize ; i++)
		  {
			 
			  //get() method used to read data from buffer and
			  // read 1 byte at a time from buffer
			  System.out.println((char)bufferfile.get());
			 
			  // write()
		  }
		 
		  inchanel.close();
		  inputFile.close();

	}

}
