package com.adu.spring_test.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	private String name;
	private int age;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public Person() {
		logger.debug("Constructor!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		logger.debug("[setName]name={}", name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		logger.debug("[setAge]age={}", age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void setBeanName(String name) {
		logger.debug("[setBeanName]name={}", name);

	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		logger.debug("[setBeanFactory]beanFactory={}", beanFactory);

	}

	public void afterPropertiesSet() throws Exception {
		logger.debug("[afterPropertiesSet]");

	}

	public void myInit() {
		logger.debug("[myInit]");
	}

	public void destroy() throws Exception {
		logger.debug("[destroy]");

	}

	public void myDestroy() {
		logger.debug("[myDestroy]");
	}

}
