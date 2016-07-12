package my.singleton;

public class TestMain {

	public static void main(String[] args) {
		
		TestSingleton3 testSingleton1 = new TestSingleton3();
		Thread t1 = new Thread(testSingleton1);
		t1.start();
		SingletonMessage singletonMessage1 = testSingleton1.showSingletonMessage();
		System.out.println("count=" + testSingleton1.doCount());
		
		TestSingleton3 testSingleton2 = new TestSingleton3();
		Thread t2 = new Thread(testSingleton2);
		t2.start();
		SingletonMessage singletonMessage2 = testSingleton2.showSingletonMessage();
		System.out.println("count=" + testSingleton2.doCount());
		
		TestSingleton3 testSingleton3 = new TestSingleton3();
		Thread t3 = new Thread(testSingleton3);
		t3.start();
		SingletonMessage singletonMessage3 = testSingleton3.showSingletonMessage();
		System.out.println("count=" + testSingleton3.doCount());
		
//		if (singletonMessage1 == singletonMessage2) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		if (singletonMessage2 == singletonMessage3) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		if (singletonMessage1 == singletonMessage3) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
	}

}
