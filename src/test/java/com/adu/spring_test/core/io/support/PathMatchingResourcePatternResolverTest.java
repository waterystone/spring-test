package com.adu.spring_test.core.io.support;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PathMatchingResourcePatternResolverTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void getResources() throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources("classpath*:**/*.xml");
		for (Resource resource : resources) {
			logger.debug(resource.getDescription());
		}
	}

}
