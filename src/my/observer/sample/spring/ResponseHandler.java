package my.observer.sample.spring;

import org.springframework.context.ApplicationListener;

public class ResponseHandler implements ApplicationListener<MessageEvent> {

	public void onApplicationEvent(MessageEvent messageEvent) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(messageEvent);
	}

}
