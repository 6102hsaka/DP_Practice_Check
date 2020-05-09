package com.designpattern.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver {

	private final String name = "John";
	static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);

	@Override
	public void onServerDown() {
		LOGGER.info("Start JohnObserver onServerDown");
		LOGGER.debug("Hello " + name + " Notification received");
		LOGGER.info("End JohnObserver onServerDown");
	}

	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}

}
