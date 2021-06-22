package threadClasses1;

public class MyThreadRunnable implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Execution thread is " + Thread.currentThread().getName());	
		
		try {
			System.out.println("I am going to Sleep");
			Thread.sleep(8000);
			System.out.println("I am Awake");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
