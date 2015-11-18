package com.adu.spring_test.cglib;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public Object getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		logger.debug("start...");
		Object result = arg3.invokeSuper(arg0, arg2);
		logger.debug("end...");
		return result;
	}

}
