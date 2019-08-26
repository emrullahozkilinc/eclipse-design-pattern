package com.emr.head_first.design_patterns.unit_1.model;

import com.emr.head_first.design_patterns.unit_1.behaivors.FlyWithWings;
import com.emr.head_first.design_patterns.unit_1.behaivors.Quack;

public class MallardQuack extends Duck{

	public MallardQuack() {
		flyBeahivour=new FlyWithWings();
		quackBeahivor=new Quack();
	}
	
	@Override
	void display() {
		System.out.println("I'm a mallard quack");
	}
	
}
