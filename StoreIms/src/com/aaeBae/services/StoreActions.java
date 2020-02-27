package com.aaeBae.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.aaeBae.entities.Item;
import com.aaeBae.entities.Store;

public class StoreActions {
	public Store CreateStore(String SName, String OName) {
		Store s = new Store(SName, OName);
		return s;
	}

	public ArrayList<Store> getStoreDetails(String storeName, ArrayList<Store> stores) {
		int count = 0;
		Store sReturn = new Store("Not Found", "Not Found");
		ArrayList<Store> returningStores = new ArrayList<Store>();
		for (Store s : stores) {
			if (storeName.equalsIgnoreCase(s.getName())) {
				returningStores.add(s);
				count++;
			}
		}
		if (returningStores.size() > 0) {
			return returningStores;
		} else {
			returningStores.add(sReturn);
			return returningStores;
		}
	}

	public Store addItems(Store s) {
		String name;
		Double cost;
		Double price;
		int qty;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item name");
		name = sc.next();
		System.out.println("Enter item cost price");
		cost = sc.nextDouble();
		System.out.println("Enter item selling price");
		price = sc.nextDouble();
		System.out.println("Enter item quantity");
		qty = sc.nextInt();
		Item item = new Item(name, cost, price, qty);
		s.setItems(item);
		return s;
	}
}
