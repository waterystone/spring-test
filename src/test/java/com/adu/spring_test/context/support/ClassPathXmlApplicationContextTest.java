package com.adu.spring_test.context.support;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adu.spring_test.model.Person;

public class ClassPathXmlApplicationContextTest {
	ApplicationContext context;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void getBean() {
		Person res = (Person) context.getBean("person");
		logger.debug("res={}", res);
	}

	@Test
	public void isSingleton() {
		boolean res = context.isSingleton("person");
		logger.debug("res={}", res);
	}

	@Test
	public void getBeanNamesForType() {
		String[] res = context.getBeanNamesForType(Person.class);
		logger.debug("res={}", res.toString());
	}

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
