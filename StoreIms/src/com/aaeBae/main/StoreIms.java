package com.aaeBae.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.aaeBae.entities.Store;
import com.aaeBae.services.StoreActions;
import com.aaeBae.services.StoreMenus;

public class StoreIms {

	public static void main(String[] args) {
		StoreMenus sm = new StoreMenus();
		ArrayList<Store> stores = new ArrayList<Store>();
		String storeName = "";
		StoreActions sa = new StoreActions();
		int option = 100;
		String sName, SOwner;
		Scanner sc = new Scanner(System.in);
		while (option != 0) {
			System.out.println(
					"Enter your choice:\n 1. Create Store\n 2. View Store details \n 3. View All Stores\n 0. Exit");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 0:
				System.out.println("bye");
				break;

			case 1:
				System.out.println("Enter Store name");
				sName = sc.nextLine();

				System.out.println("Enter Store Owner name");
				SOwner = sc.nextLine();

				System.out.println("Store Created");
				System.out.println(sa.CreateStore(sName, SOwner));
				stores.add(sa.CreateStore(sName, SOwner));
				break;

			case 2:

				System.out.println("Enter Store Name");
				storeName = sc.next();

				System.out.println(sa.getStoreDetails(storeName, stores));
				if (sa.getStoreDetails(storeName, stores).get(0).getName().equals("Not Found")) {
					break;
				} else {
					sm.viewStoreMenu(sa.getStoreDetails(storeName, stores));
				}
				break;

			case 3:
				for (Store s : stores) {
					System.out.println(s);
				}
				break;

			default:
				System.out.println("wrong input.");
				break;

			}

		}

	}

}
