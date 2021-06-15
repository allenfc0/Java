package Assignment;

import java.io.File;
import java.util.Scanner;

public class Cars_Information {
	public static void main(String [] args) {
	String path = "D:\\Program Files\\PerScholas\\Week 3-Java\\Res\\cars.csv";
	
	
	
	try {
		File doc = new File(path);
		Scanner sc = new Scanner(doc);
		String[] arr = null;
		int i = 0;
		while(sc.hasNextLine()) {
			arr = sc.nextLine().split(" ,");
			System.out.println(arr[i]);
			i++;
		}
		
//		for(String x : arr) {
//			System.out.println(x);
//		}
		sc.close();
		
		
	}catch(Exception e) {
		
	}
	}
	
	
//	public ArrayList<Cars> setCarsInformation() {
//		
//	}
//	
//	public void getCarsInformation() {
//		
//	}
	
}
