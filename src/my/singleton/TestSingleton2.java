package my.singleton;

public class TestSingleton2 {

	public SingletonMessage showSingletonMessage() {
		SingletonMessage singletonMessage = SingletonMessage.getInstance();
		return singletonMessage;
	}
	
}
