package bankCustumer;

public class Runner {
	public static void main(String[] args) {
		
		ATM  atm = new ATM();
		
		new Thread()
		{
			public void run()
			{
		System.out.println("Execution withdraw t:" + Thread.currentThread().getName());
				atm.withdraw(2000);
			}
		}.start();
		
		
		new Thread()
		{
			public void run()
					{
				System.out.println("Execution deposit t:" + Thread.currentThread().getName());
						atm.deposit(3000);
					}
		}.start();
	}
}
