package com.adu.spring_test.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;

public class FileCopyUtilsTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void copyToString() throws IOException {
		Reader reader = new BufferedReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("log4j.xml")));
		String res = FileCopyUtils.copyToString(reader);
		logger.debug("res={}", res);
	}
}
