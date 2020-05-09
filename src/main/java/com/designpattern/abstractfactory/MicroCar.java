package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {

	static final Logger LOGGER = LoggerFactory.getLogger(MicroCar.class);

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.info("Start MicroCar construct");
		LOGGER.debug("Connecting to Micro Car....");
		LOGGER.info("End MicroCar construct");
	}
}