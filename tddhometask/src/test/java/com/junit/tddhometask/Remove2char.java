package com.junit.tddhometask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2char {
	Remove remove1;
	@BeforeEach
	void setUp() {
		remove1 = new Remove();
	}
	@Test
	void testchar1() {
		String result = remove1.removechar("ABCD");
		assertEquals("BCD", result);
		
	}
	@Test
	void testchar2() {
		String result = remove1.removechar("ABCDA");
		assertEquals("BCDA", result);
		
	}
	@Test
	void testchar3() {
		String result = remove1.removechar("AABCDA");
		assertEquals("BCDA", result);
		
	}
	@Test
	void testchar4() {
		String result = remove1.removechar("BABCDA");
		assertEquals("BBCDA", result);
	}

}
