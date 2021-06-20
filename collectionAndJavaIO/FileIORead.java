package collectionAndJavaIO;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIORead {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		  String fname = "C:\\Users\\Allen\\Documents\\PerScholas\\Week 3-Java\\CoreJavaBasics\\src\\com\\perscholas\\java_basics\\cars.csv";
		  FileInputStream fin = null;
		  try {
			  fin = new FileInputStream(fname);
			  	// System.out.println(fin.read());  //H
		   int data = 0;
		   while((data = fin.read()) != -1 )
		   {
			   char finalDAta =  (char)data;
			   System.out.print(finalDAta);
		   }
		}// try block end
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			if(!fin.equals(null))
			{
			  try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
