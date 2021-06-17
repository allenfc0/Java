package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkst = new LinkedList<String>();
		LinkedList<Integer> linkint = new LinkedList<Integer>();
		LinkedList link = new LinkedList();
		
		System.out.println(linkst);
		
		linkst.add("A");
		linkst.add("B");
		linkst.add("C");
		linkst.add("D");
		linkst.add("E");
		System.out.println(linkst);
		
		linkst.set(2, "Haseeb");
		
		System.out.println(linkst);
		
		int Lsize =  linkst.size();
		System.out.println("size of list is :" + Lsize);
		
//		linkst.remove(3);
//		linkst.remove("A");
//		linkst.removeFirst();
//		linkst.removeLast();
		
		System.out.println("Removing value from 3rd index:" + linkst);
		
		//------------- advance forloop ----------------
		
		for(String v : linkst)
		{
			System.out.println(v);
		}
		
		// --------------- iterators-------------
		 Iterator itr = linkst.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
		
		 LinkedList<String> list2 = new LinkedList<String>();
		 list2.add("perscolas");
		 list2.add("Teksystem");
		
		 linkst.addAll(2, list2);
		 System.out.println(linkst);
		
	}


}
