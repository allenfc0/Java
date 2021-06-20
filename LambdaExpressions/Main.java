package LambdaExpressions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chilclass cObj = new chilclass();
		
		String result = cObj.my.sayhello("Haseeb");
		System.out.println(result);
		
	// convert chaining method expression into lambda
		
		
		//() -> {}
		myfuncinterf obj = (p) -> {
			String a = p;
			return a;
		};
				
		obj.sayhello("haseeb");
	}

}
