package com.adu.spring_test.cglib;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCglibProxyTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void hello() {
		MyCglibProxy proxy = new MyCglibProxy();
		MyService myService = (MyService) proxy.getProxy(MyService.class);
		myService.hello();
		logger.debug("~~~~");
	}

}
