package threadClasses0;

public class Threadone extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("invoke methods here");
		sayhello();
		saybye();
		
	}
	
	
	public void sayhello()
	{
		System.out.println("Good morning");
		int a = 5 + 5;
		System.out.println(a);
	}
	
	public void saybye()
	{
		System.out.println("Good bye");
		int a = 5 + 4;
		System.out.println(a);
	}
}
