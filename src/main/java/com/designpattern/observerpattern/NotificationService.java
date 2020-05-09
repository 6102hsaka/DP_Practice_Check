package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers;
	static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}

	@Override
	public void addSubscriber(INotificationObserver observer) {
		LOGGER.info("Start NotificationService addSubscriber");
		observers.add(observer);
		LOGGER.debug("List of Subscriber after Addition");
		LOGGER.debug("Subscriber List{} ", observers);
		LOGGER.info("End NotificationService addSubscriber");
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		LOGGER.info("Start NotificationService removeSubscriber");
		observers.remove(observer);
		LOGGER.debug("List of Subscriber after Removal");
		LOGGER.debug("Subscriber List{} ", observers);
		LOGGER.info("End NotificationService removeSubscriber");
	}

	@Override
	public void notifySubscriber() {
		LOGGER.info("Start NotificationService notifySubscriber");
		for (INotificationObserver observer : observers)
			observer.onServerDown();
		LOGGER.info("End NotificationService notifySubscriber");
	}
}