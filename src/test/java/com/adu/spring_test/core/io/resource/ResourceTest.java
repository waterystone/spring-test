package com.adu.spring_test.core.io.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResourceTest {
	private Resource resource = new ClassPathResource("log4j.xml");
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void exists() {
		boolean res = resource.exists();
		logger.debug("res={}", res);
	}

	@Test
	public void getFilename() {
		String res = resource.getFilename();
		logger.debug("res={}", res);
	}

	@Test
	public void getInputStream() throws IOException {
		InputStream inputStream = resource.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		String line = null;
		StringBuffer buffer = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			buffer.append(line + "\n");
		}
		logger.info("inputStream={},buffer={}", inputStream, buffer);
	}

}
