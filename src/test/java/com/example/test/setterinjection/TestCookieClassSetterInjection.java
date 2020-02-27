package com.example.test.setterinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.ExampleApplicationSI;
import com.example.setterinjection.Cookie;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExampleApplicationSI.class)
public class TestCookieClassSetterInjection {

	@Autowired
	Cookie cookie;

	@Test
	public void testSetterInjection() {
		String testColor = cookie.getTopping().getToppingName();
		Assert.assertEquals(testColor, null);
	}
}
