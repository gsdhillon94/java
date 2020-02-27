package com.aaeBae.entities;

public class Item {
	private String name;
	private Double cost;
	private Double price;
	private int qty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Item(String name, Double cost, Double price, int qty) {
		super();
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", cost=" + cost + ", price=" + price + ", qty=" + qty + "]";
	}

}
