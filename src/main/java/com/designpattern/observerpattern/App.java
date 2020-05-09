package com.designpattern.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	
	static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Start main");
		
		INotificationService service = new NotificationService();

		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();

		// adding Subscriber
		service.addSubscriber(steve);
		service.addSubscriber(john);

		//notifying Subscriber
		service.notifySubscriber();

		// removing one Subscriber
		service.removeSubscriber(john);
		LOGGER.info("End main");
	}

}
