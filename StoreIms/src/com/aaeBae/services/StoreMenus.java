package com.aaeBae.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.aaeBae.entities.Store;

public class StoreMenus {
	public void viewStoreMenu(ArrayList<Store> store) {
		int option;
		Scanner sc = new Scanner(System.in);
		StoreActions sa = new StoreActions();
		System.out.println("select option\n 1. Add Items\n 2. Edit items\n 0. Previous Menu");
		option = sc.nextInt();
		switch (option) {
		case 0:
			break;
		case 1:
			System.out.println(sa.addItems(store.get(0)));
		}
	}
}
