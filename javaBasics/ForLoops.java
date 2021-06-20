package javaBasics;
import java.util.*;
public class ForLoops {

	public static void main(String[] args) {
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
//				if(i % 2 == 0) System.out.print(" ");
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		System.out.println("Please enter a number to check prime.");
        boolean isPrime = false;
        Scanner scan = new Scanner(System.in);
        int primeInput = scan.nextInt();
            for(int j = 1; j <= primeInput; j++) {
            if(primeInput %j == 0 && primeInput != j && j != 1) {
                isPrime = false;
                break;
            }else {
                isPrime = true;
            }
        }
            System.out.println("The result of our prime check is: " + isPrime);
        scan.close();
	
	
}
}
