package com.adu.spring_test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class HelloTest {
	private final Log logger = LogFactory.getLog(this.getClass());

	@Test
	public void test() {
		logger.debug("hello,world!");
	}

}
