package com.adu.spring_test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Hello {
	private final Log logger = LogFactory.getLog(this.getClass());

	public void test() {
		logger.debug("hello,world!");
	}

}
