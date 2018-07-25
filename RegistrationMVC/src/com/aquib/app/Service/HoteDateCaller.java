package com.aquib.app.Service;

import com.aquib.app.dao.HotDateDao;

public class HoteDateCaller {

	public static void main(String[] args) {

		HotDateDao daoCaller = new HotDateDao();
		daoCaller.getHotDateDetails();
		System.out.println("------>");
	}

}
