package com.blinkingwood.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coffee {

	private Milk milk;

	/**
	 * setter based injection
	 */
	@Autowired
	private Sugar sugar;

	/**
	 * Constructor based injection, with {@ Milk} as the hard dependency
	 * 
	 * @param milk
	 */
	@Autowired
	public Coffee(Milk milk) {
		super();
		this.milk = milk;
	}

	public Milk getMilk() {

		return milk;
	}

	public Sugar getSugar() {

		return sugar;
	}

	public void setSugar(Sugar sugar) {

		this.sugar = sugar;
	}

}