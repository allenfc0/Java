package threadClasses1;

public class Runner {
	
	public static void main(String[] args) {
	
		/* Thread.sleep() interacts with the thread scheduler to put the
 		current thread in wait state for specified period of time. once
		the wait time is over, thread state in changed to Runnable
		state and wait for the CPU for further execution. sp that actual
		time that current thread sleep depends on the Thread Scheduler
		that is part of the OS */
	MyThreadRunnable obj =	new  MyThreadRunnable();
	Thread t1 = new Thread(obj, "sleeping thread");	
	t1.start();
	
	
	 MyThreadExtendDemo t2 = new  MyThreadExtendDemo();
	 t2.setName("2nd Thread");
	 t2.start();
	
	 MyThreadExtendDemo t3 = new MyThreadExtendDemo();
	 t3.setName("3rd Thread");
	 t3.start();
	}
}
