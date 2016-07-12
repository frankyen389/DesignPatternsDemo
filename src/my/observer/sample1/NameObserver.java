package my.observer.sample1;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {
	
	private String name=null;
	
	public void update (Observable obj,Object arg){
		if (arg instanceof String){
			name=(String)arg;
			System.out.println("NameObserver :name changet to "+name);
		}
	}
	
}