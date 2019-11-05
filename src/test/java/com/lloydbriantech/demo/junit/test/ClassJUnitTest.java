package com.lloydbriantech.demo.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import com.lloydbriantech.demo.junit.*;

class ClassJUnitTest {

	private ClassToJUnit testObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		testObj = new ClassToJUnit();
	}

	@AfterEach
	void tearDown() throws Exception {
		testObj = null;
	}

	@Test
	@DisplayName("TestCase 01: getAverageTest")
	void testGetAverage_DivisionZero() {
		int a =0, b =0;
		testObj.MysteryMethod(a, b);
		assertEquals(testObj.getAverage(), 0);
	}	
	
}
