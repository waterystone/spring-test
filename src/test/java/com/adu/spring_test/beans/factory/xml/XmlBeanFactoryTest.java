package com.adu.spring_test.beans.factory.xml;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.adu.spring_test.model.Person;

public class XmlBeanFactoryTest {
	XmlBeanFactory beanFactory;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void getBean() {
		Person res = (Person) beanFactory.getBean("person");
		logger.debug("res={}", res);
	}

	@Test
	public void getBean1() {
		Person res = beanFactory.getBean(Person.class);
		logger.debug("res={}", res);
	}

	@Test
	public void containsBean() {
		boolean res = beanFactory.containsBean("person");
		logger.debug("res={}", res);
	}

	@Test
	public void getType() {
		Class<?> res = beanFactory.getType("person");
		logger.debug("res={}", res);
	}

	@Test
	public void isTypeMatch() {
		boolean res = beanFactory.isTypeMatch("person", Person.class);
		logger.debug("res={}", res);
	}

	@Test
	public void destroySingleton() {
		Person person = (Person) beanFactory.getBean("person");
		logger.debug("person={}", person);
		beanFactory.destroySingleton("person");
		logger.debug("end");
	}

	@Before
	public void before() {
		Resource resource = new ClassPathResource("applicationContext.xml");
		beanFactory = new XmlBeanFactory(resource);
	}

}
