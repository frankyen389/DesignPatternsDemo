package my.singleton;

public class TestSingleton1 {
	
	public SingletonMessage showSingletonMessage() {
		SingletonMessage singletonMessage = SingletonMessage.getInstance();
		return singletonMessage;
	}

}
