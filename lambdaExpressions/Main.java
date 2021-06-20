package lambdaExpressions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chilclass cObj = new chilclass();
		
		String result = cObj.my.sayhello("Haseeb");
		System.out.println(result);
		
	// convert chaining method expression into lambda
		
		
		//() -> {}
		
		//lambda functions only work with functional interfaces
		myfuncinterf obj = (p) -> "Hello" + p + "\this is from lambda function";
	
				
		System.out.println(obj.sayhello("Allen"));
		
		
		
	}

}
