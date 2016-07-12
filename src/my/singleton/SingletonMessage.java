package my.singleton;

public class SingletonMessage {

	private static SingletonMessage singletonMessage = null;
	
	private static int i = 0;
	
	public synchronized static SingletonMessage getInstance() {
		if (singletonMessage == null) {
			i++;
			System.out.println(i);
			singletonMessage = new SingletonMessage();
		}
		return singletonMessage;
	}
	
}
