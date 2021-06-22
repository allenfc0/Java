package threadClasses2;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new HeavyWorkRunnbale(), "t1");
		Thread t2 = new Thread(new HeavyWorkRunnbale(), "t2");
		System.out.println("Starting Runnable Thread");
		t1.start();
		t1.join();  // We generally have more than one thread, thread Schdeduler Schedules the Thread, which
		// does not Guarantee the order of the Execution of the Thread
		t2.start();
		
		System.out.println("Runnable thread has been started");
	}
}
