package CollectionAndJavaIO;

import java.io.FileOutputStream;

public class FileIOWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "C:\\Users\\Allen\\Documents\\PerScholas\\Week 3-Java\\CoreJavaBasics\\src\\com\\perscholas\\java_basics\\Tests\\writetest.txt";
		FileOutputStream fw = null;
		
		try {
			fw = new FileOutputStream(fname);
			fw.write(65);
			fw.write(66);
			fw.write(67);
			fw.write(68);
			fw.write(69);
		} catch(Exception e) {
			
		}
	}

}
