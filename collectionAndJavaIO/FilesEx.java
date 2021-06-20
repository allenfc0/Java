package collectionAndJavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesEx {
	public static void main(String[] args) {
		String path = "C:\\Users\\Allen\\Documents\\PerScholas\\Week 3-Java\\CoreJavaBasics\\src\\com\\perscholas\\java_basics";
		String fNames[] = {"0.txt", "1.txt", "2.txt", "3.txt"};
	
		for (String fName : fNames) {
	
			try {
	
			File file = new File(path + "\\" + fName);
			Scanner sc = new Scanner(file);
	 
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
			
			} catch (FileNotFoundException e) {
	
				System.out.println("File not found");
				e.printStackTrace();
	
			}
			
		}
	}
}
