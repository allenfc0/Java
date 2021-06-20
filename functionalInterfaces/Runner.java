package functionalInterfaces;

public class Runner {
	public static void main(String[] args) {
	
	subclass sbObj = new  subclass();
	double data = sbObj.sq.findSqroot(4);
	System.out.println(data);
	
	
	
	
	int res = sbObj.cs.calculate(100);
	System.out.println(res);
	}
}
