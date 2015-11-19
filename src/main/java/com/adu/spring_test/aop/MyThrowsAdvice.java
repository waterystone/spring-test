package com.adu.spring_test.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void afterThrowing(Method method, Object[] args, Object target, Throwable e) throws Throwable {
		logger.debug("method={},exception={}", method.getName(), e);

	}

}
