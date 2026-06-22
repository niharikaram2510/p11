package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	@Test
	public void testApp(){
		int a=2;
		int b=3;
		int sum=a+b;
		System.out.println("Sum:"+sum);
		System.out.println("Test executed successfully");
		Assert.assertEquals(5,sum);
	}
}
