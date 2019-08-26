package com.emr.head_first.design_patterns.unit_1.model;

import com.emr.head_first.design_patterns.unit_1.behaivors.FlyBeahivour;
import com.emr.head_first.design_patterns.unit_1.behaivors.QuackBeahivor;

public abstract class Duck {
	
	FlyBeahivour flyBeahivour;
	QuackBeahivor quackBeahivor;
	
	void swim() {
		
	}
	
	abstract void display();
	
	
	String performQuack() {
		return quackBeahivor.quack();
	}
	
	String performFly() {
		return flyBeahivour.fly();
	}
	
	public void setFlyBeahivour(FlyBeahivour flyBeahivour) {
		this.flyBeahivour = flyBeahivour;
	}
	
	public void setQuackBeahivor(QuackBeahivor quackBeahivor) {
		this.quackBeahivor = quackBeahivor;
	}
	
}
