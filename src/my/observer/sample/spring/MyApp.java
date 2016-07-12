package my.observer.sample.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String args[]) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context.xml");
		
		EventSource eventSource = applicationContext.getBean("eventSource", EventSource.class);
		Thread thread = new Thread(eventSource);
		thread.start();
		
	}
	
}
