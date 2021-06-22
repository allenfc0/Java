package threadClasses0;

public class ThreadTwo implements Runnable{
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		sayhello();
	}
	
	public void sayhello()
	{
		System.out.println("helloo: Good morning");
	}
}
