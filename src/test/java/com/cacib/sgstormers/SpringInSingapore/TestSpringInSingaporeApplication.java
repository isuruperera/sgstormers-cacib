package com.cacib.sgstormers.SpringInSingapore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringInSingaporeApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringInSingaporeApplication::main).with(TestSpringInSingaporeApplication.class).run(args);
	}

}
