package my.observer.sample1;

public class TestObserver {

	public static void main(String[] args) {
		Product product=new Product();

		NameObserver nameobs=new NameObserver();
		PriceObserver priceobs=new PriceObserver();
		
		product.addObserver(nameobs);
		product.addObserver(priceobs);

		product.setName("橘子紅了");
		product.setPrice(9.22f);

	}

}
