package com.adu.spring_test.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		logger.debug("afterReturning...");

	}

}
