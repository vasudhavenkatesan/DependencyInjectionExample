package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.setterinjection.Cookie;

@SpringBootApplication(scanBasePackages = { "com.example.setterinjection", "com.example.dependency" })
public class ExampleApplicationSI {

	private static Logger LOGGER = LoggerFactory.getLogger(ExampleApplicationSI.class);

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ExampleApplicationSI.class, args);
		Cookie obj = context.getBean(Cookie.class);
		LOGGER.info("Cookie : " + obj.toString());
	}

}
