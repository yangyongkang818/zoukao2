package com.yyk.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1,3);
		
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] i = RandomUtil.subRandom(1, 10, 3);
		
		for (int j : i) {
			System.out.println(j);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
