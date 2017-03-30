package org.nyngwang.composite;

import java.util.ArrayList;

public abstract class Place implements FindFood {
	protected String name;
	protected ArrayList<FindFood> thought;
	
	public Place(String name) {
		this.name = name;
		thought = new ArrayList<FindFood>();
	}
	
	@Override
	public String whatIveThought() {
		String result = "At " + name + ":\n";
		for (FindFood each: thought) {
			result += " " + each.whatIveThought() + "\n";
		}
		return result;
	}
	
	public void add(FindFood thought) {
		this.thought.add(thought);
	}
}