package my.singleton;

public class TestSingleton3 implements Runnable {

	SingletonMessage singletonMessage = null;
	
	int count = 0;
	
	public int doCount() {
		return ++count;
	}
	
	public SingletonMessage showSingletonMessage() {
		return singletonMessage;
	}
	
	@Override
	public void run() {
		singletonMessage = SingletonMessage.getInstance();
		System.out.println(singletonMessage.hashCode());
		System.out.println("TestSingleton3 count=" + count);
	}

}
