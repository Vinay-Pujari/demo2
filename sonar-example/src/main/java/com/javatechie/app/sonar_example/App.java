package com.javatechie.app.sonar_example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {


	public void m1() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Object obj = getData();
		if(obj != null)
			System.out.println(obj.toString());
	}

	public Object getData() {
		return null;
	}

	public static void main(String[] args) {
		App app = new App();
		app.m1();
	}
}
