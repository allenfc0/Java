package StringClasses;

public class StringBuilderEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		// empty stringbuffer reserve 16 character in memory
		StringBuffer sbb = new StringBuffer(20);
		StringBuffer sbbb = new StringBuffer("Hello world my name is");
		
		//(16 * 2) + 2  i.e (oldcapacity * 2) + 2
		
		System.out.println(sb.capacity());
		System.out.println(sbb.capacity());
		System.out.println(sbbb.capacity());
		// return the lenght (character count) of the string buffer
		System.out.println(sb.length());
		System.out.println(sbb.length());
		System.out.println(sbbb.length());
		
		StringBuffer s = new StringBuffer("Hello World");
		s.append(" We are learning JAva");
		s.append(" we also love python lang");
		
		
		System.out.println(s);
		
		s.insert(6, "Allen");
		System.out.println(s);
		
		s.delete(0, 6);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		//Reverse a String in one line
		System.out.println(new StringBuilder("hello").reverse());
		
	}
}
