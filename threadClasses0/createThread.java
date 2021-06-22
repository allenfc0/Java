package threadClasses0;

public class createThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////  --------------by using extends -------------		
		Threadone t1 = new Threadone();
		//Thread T1 = new Thread(TObj);
		t1.start();
		t1.setName("First Thread");
		
		
		//Thread T2 = new Thread(TObj);
		Threadone T2 = new Threadone();
		T2.setName("sec Thread");
		T2.start();
		
//----------- by using Runnable interface-----------
		
		//ThreadTwo TRObj = new ThreadTwo();
		//Thread t3 = new Thread(TRObj);
		//t3.start();
		
// invoke thread by using anonymous instance
		messenger m = new messenger();
		
		
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("TASK ONE is RUNNING");
				m.msgOne();
				
			}
		};
		Thread t4 =  new Thread(task1);
		t4.start();
		
		
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("TASK TWO IS RUNNING");
				m.msgTwo();
			}
		};
		
		Thread t5 = new Thread(task2);
		t5.start();
		
	Runnable task3 =	() -> {
		System.out.println("TASK THREE IS RUNNING");
		m.msgTwo();
	};
	
	Thread t6 = new Thread(task3);
	t6.start();
		
	
	
	new Thread()
	{
		public void run()
		{
			
			System.out.println("=============================");
			System.out.println("main method / thread will invoke");
			System.out.println(Thread.currentThread().getName());
			m.msgOne();
		}
	}.start();
	
	}
}
