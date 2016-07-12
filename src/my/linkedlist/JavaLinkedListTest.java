package my.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedListTest {

	
	public JavaLinkedListTest() {
		LinkedList list = new LinkedList();
		list.add("Hello");
	    list.add("world");
	    Iterator ite = list.iterator();
	    while(ite.hasNext()) {
	    	String s = (String)ite.next();
	    	System.out.println(s);
	    }
	}
	
	public static void main(String[] args) {
		new JavaLinkedListTest();
	}

}
