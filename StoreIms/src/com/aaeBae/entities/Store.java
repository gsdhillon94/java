package com.aaeBae.entities;

import java.util.ArrayList;

public class Store {
	private String name;
	private String Owner;
	private ArrayList<Item> items;

	public Store(String name, String owner) {
		super();
		this.name = name;
		Owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items.add(items);
	}

	@Override
	public String toString() {
		return "Store name=" + name + ", Owner=" + Owner + ", items=" + items;
	}

}
