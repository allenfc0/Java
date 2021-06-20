package functionalInterfaces;

@FunctionalInterface
public interface sqroot {
	
	double findSqroot(int n);
	
	//double findnumber();
	default void showmessahe()
	{
		System.out.println("my msg");
	}
	default void showmessahe(int a)
	{
		System.out.println("my msg");
	}
	default void showmessahe(int a, int b)
	{
		System.out.println("my msg");
	}

}
