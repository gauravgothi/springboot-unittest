package com.gaurav.unittestingdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class UnittestingdemoApplicationTests {

	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}
	@Test
	void testSum()	{

		int expectedResult = 45;

		int actualResult = c.doSum(5,15,25);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testProduct()	{
		int expectedResult = 75;

		int actualResult = c.doProduct(5,10);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testCompare()	{
		boolean actualResult= c.doCompare(3,4);

		assertThat(actualResult).isTrue();
	}

}
