package com.emr.head_first.design_patterns.unit_2_observer_pattern;

import java.util.LinkedList;
import java.util.List;

public abstract class Observable <E> {
	List<E> observers;
	boolean isChanged;
	
	public Observable() {
		isChanged=false;
		observers=new LinkedList<E>();
	}
	
	void addSubscribe(E display) {
		observers.add(display);
	}
	
	void removeSubscribe(E display) {
		observers.remove(observers.indexOf(display));
	}
	
	void measurementsChanged() {
		isChanged=true;
		update();
	}
	
	abstract void update();		

}
