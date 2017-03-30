package org.nyngwang.composite;

public abstract class Food implements FindFood {
	protected String name;
	
	public Food(String name) {
		this.name = name;
	}
	@Override
	public String whatIveThought() {
		return name;
	}
}