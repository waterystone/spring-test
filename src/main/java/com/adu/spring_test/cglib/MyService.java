package com.adu.spring_test.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void hello() {
		logger.debug("Hello,World!");
	}

	public void throwsException() {
		throw new RuntimeException();
	}
}
