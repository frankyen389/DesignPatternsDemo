package my.observer.sample.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventSource implements Runnable, ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher = null;

	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void run() {
		//final InputStreamReader isr = new InputStreamReader(System.in);
		//final BufferedReader br = new BufferedReader(isr);
		int i = 0;
		while (i < 3) {
			try {
				//String response = br.readLine();
				String response = "test" + i;
				System.out.println(Thread.currentThread().getName());
				this.applicationEventPublisher.publishEvent(new MessageEvent(this, response));
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
