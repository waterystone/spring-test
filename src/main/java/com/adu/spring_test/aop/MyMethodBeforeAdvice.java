package com.adu.spring_test.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		logger.debug("before...");

	}

}
