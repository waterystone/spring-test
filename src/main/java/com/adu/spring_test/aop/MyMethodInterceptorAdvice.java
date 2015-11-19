package com.adu.spring_test.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMethodInterceptorAdvice implements MethodInterceptor {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public Object invoke(MethodInvocation arg0) throws Throwable {
		logger.debug("before...");
		Object res = arg0.proceed();
		logger.debug("after...");
		return res;
	}

}
