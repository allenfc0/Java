package javaBasics;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		//one();
		//two();
		//three();
		//four();
		//five();
		//six();
		//seven();
		//eight();
		//nine();
		//ten();
	}
	
	static void one() {
		int nums[] = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		for(int x: nums) {
			System.out.println(x);
		}
	}
	
	
	static void two() {
		int nums[] = {13, 5, 7, 68, 2};
		System.out.println(nums[(nums.length - 1) / 2]);
	}
	
	
	static void three() {
		String colors[] = {"red", "green", "blue", "yellow"};
		System.out.println(colors.length);
		String c[] = colors.clone();
		System.out.println(Arrays.toString(c));
	}
	
	
	static void four() {
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		nums[3] = 13;
		nums[4] = 14;
		//Exception
		//nums[5] = 15;
		System.out.println(nums[0]);
		System.out.println(nums[nums.length - 1]);
		//Exception
		//System.out.println(nums[nums.length]);
	}
	
	
	static void five() {
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		nums[3] = 13;
		nums[4] = 14;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	
	static void six() {
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		nums[3] = 13;
		nums[4] = 14;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] * 2);
		}
	}
	
	
	static void seven() {
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		nums[3] = 13;
		nums[4] = 14;
		
		for(int i = 0; i < nums.length; i++) {
			if(i == 2) continue;
			System.out.println(nums[i]);
		}
	}
	
	
	static void eight() {
		String colors[] = {"red", "green", "blue", "yellow", "purple"};
		String f = colors[0];
		colors[0] = colors[2];
		colors[2] = f;
		for(String s : colors) {
			System.out.println(s);
		}
	}
	
	
	static void nine() {
		int nums[] = {4, 2, 9, 13, 1, 0};
		int swap;
		
		for(int i = 0; i < nums.length; i++) {
			swap = nums[i];
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					swap = nums[i];
					nums[i] = nums[j];
					nums[j] = swap;
				}
			}
		}
		System.out.print("Array in Ascending order: " + Arrays.toString(nums) + "\n");
		System.out.println("The smallest number is " + nums[0]);
		System.out.println("The biggest number is " + nums[5]);
	}
	
	
	static void ten() {
		Object obj[] = {0, "red", "blue", "yellow", 1.3};
		System.out.println(Arrays.toString(obj));
	}
}


























