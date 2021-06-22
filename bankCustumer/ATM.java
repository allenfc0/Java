package bankCustumer;

public class ATM {
	private int amount = 100;
	 public synchronized void withdraw( int amount)
	 {
		
		 System.out.println("Goin to withdraw");
		 if(this.amount < amount ) {
			 System.out.println("Less Balance: Please deposite some amount");
			 try {
				System.out.println("waiting for deposit");
				wait();
				System.out.println(this.amount);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
		
			this.amount -= amount;
			System.out.println("withdraw completed. Your balance is " + this.amount);
			
		
		
	 }
	 
	 public synchronized void deposit(int amount)
	 {
		 System.out.println("Going to deposit amount");
		 this.amount += amount;
		 //System.out.println("Amount: " + this.amount);
		
		 try {
			 System.out.println("please wait we are updating your database");
			Thread.sleep(3000);
			 System.out.println("Desposit completed, you can withdraw");
		
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 	notify();
	 }
	

}
