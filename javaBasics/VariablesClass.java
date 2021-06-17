package javaBasics;

public class VariablesClass {
	public static void main(String[] args) {
		
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to each, 
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */
		int a, b;
		a = 1;
		b = 2;
		int sum = a + b;
		System.out.println(sum);
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each, and 
		 * adds them together. Assign the sum to a variable. Print out the result.
		 */
		double c, d;
		c = 3.2;
		d = 4.5;
		double sum1 = c + d;
		System.out.println(sum1);
		
		/*
		 * Write a program that declares an integer variable and a double variable, assigns 
		 * numbers to each, and adds them together. Assign the sum to a variable. Print out 
		 * the result. What variable type must the sum be?
		 */
		int e;
		double f;
		e = 5;
		f = 4.5;
		double sum2 = Double.valueOf(e) + f;
		System.out.println(sum2);
		
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to each, and 
		 * divides the larger number by the smaller number. Assign the result to a variable. 
		 * Print out the result. Now change the larger number to a decimal. What happens? What 
		 * corrections are needed?
		 * ANSWER: the answer was truncated/rounded down to an integer when both variables are 
		 * integers but divides with decimals in the result when there's a double holding the larger number
		 */
		int g = 2;
		int h = 3;
		double res = h / g;
		System.out.println(res);
		
		int i = 2;
		double j = 3;
		double res1 = j / i;
		System.out.println(res1);
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each, and divides 
		 * the larger by the smaller. Assign the result to a variable. Print out the result. Now, 
		 * cast the result to an integer. Print out the result again.
		 */
		double k, l;
		k = 3.2;
		l = 4.5;
		double res2 = l / k;
		System.out.println((int) res2);
		
	}
}


























