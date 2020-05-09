package com.designpattern.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver {

	private final String name = "Steve";
	static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);

	@Override
	public void onServerDown() {
		LOGGER.info("Start SteveObserver onServerDown");
		LOGGER.debug("Hello " + name + " Notification received");
		LOGGER.info("End SteveObserver onServerDown");
	}

	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}

}
