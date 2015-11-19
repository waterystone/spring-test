package com.adu.spring_test.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import com.adu.spring_test.cglib.MyService;

public class AdviceTest {
	private MyService proxy;
	private ProxyFactory factory;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void before() {
		BeforeAdvice beforeAdvice = new MyMethodBeforeAdvice();

		factory.addAdvice(beforeAdvice);

		proxy = (MyService) factory.getProxy();
		proxy.hello();
		logger.debug("~~~~");
	}

	@Test
	public void afterReturning() {
		AfterReturningAdvice myAfterReturningAdvice = new MyAfterReturningAdvice();

		factory.addAdvice(myAfterReturningAdvice);

		proxy = (MyService) factory.getProxy();
		proxy.hello();
		logger.debug("~~~~");
	}

	@Test
	public void intercept() {
		MethodInterceptor methodInterceptor = new MyMethodInterceptorAdvice();

		factory.addAdvice(methodInterceptor);

		proxy = (MyService) factory.getProxy();
		proxy.hello();
		logger.debug("~~~~");
	}

	@Test
	public void afterThrowing() {
		ThrowsAdvice myThrowsAdvice = new MyThrowsAdvice();

		factory.addAdvice(myThrowsAdvice);

		proxy = (MyService) factory.getProxy();
		proxy.throwsException();
		logger.debug("~~~~");
	}

	@Before
	public void init() {
		MyService myService = new MyService();

		factory = new ProxyFactory();
		factory.setTarget(myService);
	}

}
