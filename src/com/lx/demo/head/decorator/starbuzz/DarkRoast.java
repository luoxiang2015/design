package com.lx.demo.head.decorator.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	@Override
	public double cost() {
		return .99;
	}
}

