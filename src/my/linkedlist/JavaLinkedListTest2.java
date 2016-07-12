package my.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedListTest2 {

	public JavaLinkedListTest2() {
		Collection list = new LinkedList();
	    list.add("Hello");
	    list.add("world");
	    
	    Iterator it = list.iterator();
	    while (it.hasNext())
	    {
	      String s = (String)it.next();
	      System.out.println(s);
	    }
	}
	
	public static void main(String[] args) {
		new JavaLinkedListTest2();
	}

}
