package com.blinkingwood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.blinkingwood.components.Milk;
import com.blinkingwood.components.Sugar;

@Configuration
@ComponentScan(basePackages = { "com.blinkingwood.*" })
public class AppConfig {

	@Bean(name = "milk")
	public Milk milk() {

		return new Milk(3);
	}

	@Bean(name = "sugar")
	public Sugar sugar() {

		return new Sugar(2);
	}

}