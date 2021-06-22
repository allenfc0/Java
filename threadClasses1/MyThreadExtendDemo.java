package threadClasses1;

public class MyThreadExtendDemo extends Thread{
	public void run()
	{
		System.out.println("Execution Thread is " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(100);
			
			for(int row = 1; row < 15; row++)
			{
			
				
					for(int col = 0; col<row; col ++)
					{
						System.out.print('*');
						
					}
					System.out.println("\n");
				}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
			
		}
}
