package com.adu.spring_test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class HelloTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void test() {
		logger.debug("hello,world!");
	}

}
