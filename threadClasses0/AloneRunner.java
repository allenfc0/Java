package threadClasses0;

public class AloneRunner {
	public static void main(String[] args) {
		
	System.out.println(Thread.currentThread());
	System.out.println("id: " + Thread.currentThread().getId());
	System.out.println("name: " + Thread.currentThread().getName());
	System.out.println("priority: " + Thread.currentThread().getPriority());
	System.out.println("state: " + Thread.currentThread().getState());
	System.out.println("thread group: " + Thread.currentThread().getThreadGroup());
	Thread.currentThread().setName("My first thread");
	System.out.println("updated name with setName(): " + Thread.currentThread().getName());
	
	}
//11:00
//--------------- thread Sleep----------------------------
//11:00
//Thread.sleep();

/*interacts with the thread scheduler to put the
 current thread in wait state for specified period of time. once
		the wait time is over, thread state in changed to Runnable
		state and wait for the CPU for further execution. sp that actual
		time that current thread sleep depends on static the Thread Scheduler
		that is part of the OS
		*/

}