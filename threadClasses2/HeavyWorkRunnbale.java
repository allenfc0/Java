package threadClasses2;

public class HeavyWorkRunnbale implements Runnable{
	public void run() {
		
		System.out.println("doing heavy Processing - start " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			System.out.println("Run Method: i am awake now. let me invoke other Method");
			// Get database connection,
			// delete unused data from DB
			doProcessing();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void doProcessing() throws InterruptedException {
		System.out.println("Hello What Do you need, i will awake after 5000 milisec");
		Thread.sleep(6000);
		System.out.println("Hi, i am awake , do  yo need help");
	}
}
