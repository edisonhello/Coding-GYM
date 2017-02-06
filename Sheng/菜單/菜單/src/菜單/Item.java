package ���;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	protected String name;
	protected ArrayList<Item> lowerName;
	public Item(String name)
	{
		this.name = name;
		lowerName = new ArrayList<Item>();
	}
	public Item(String name,ArrayList<Item> lowerName)
	{
		this.name = name;
		this.lowerName = lowerName;
	}
	public String print()
	{
		String temp = name + "\n";
		int length = lowerName.size();
		for(int i=1;i<=length;i++)
		{
			temp += i + "." + lowerName.get(i-1).print();
		}
		return temp;
	}
	public String getName() {
		return name;
	}
}
