package functionalInterfaces;

public class subclass {
	sqroot sq = new sqroot() {
		
	@Override
	public double findSqroot(int n) {
	// TODO Auto-generated method stub
	double result = Math.sqrt(n);
	return result;
		}
		
	};
	
	
	
	calculateshape cs = new calculateshape() {
		
		@Override
		public int calculate(int x) {
			// TODO Auto-generated method stub
			int s = x * x;
			return s;
		}
	};
}
