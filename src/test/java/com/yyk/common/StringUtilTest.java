package com.yyk.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean result = StringUtil.hasLength(" ");
		System.out.println(result);
	}

	@Test
	public void testHasText() {
		boolean result = StringUtil.hasText(" ");
		System.out.println(result);
	}

	@Test
	public void testRandomChineseString() throws Exception {
		
		String randomChineseString = StringUtil.randomChineseString(2);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() throws Exception {
		
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}

}
