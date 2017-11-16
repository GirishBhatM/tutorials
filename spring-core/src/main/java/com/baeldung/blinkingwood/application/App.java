package com.blinkingwood.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.blinkingwood.components.Coffee;
import com.blinkingwood.config.AppConfig;

/**
 * Application class
 *
 *
 */
public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Coffee coffee = context.getBean(Coffee.class);

		System.out.println("milk quantity " + coffee.getMilk().getQuantity());

		System.out.println("sugar quantity " + coffee.getSugar().getCubes());
	}
}