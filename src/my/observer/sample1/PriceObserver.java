package my.observer.sample1;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {

	private float price=0;
	
	public void update(Observable obj,Object arg){

		if (arg instanceof Float){
			price=((Float)arg).floatValue();
			System.out.println("PriceObserver :price changet to "+price);
		}
		
	}
}