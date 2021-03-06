package template.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template.CaffeineBeverageWithHook;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y"))
			return true;
		return false;
	}

	private String getUserInput() {
		String answer = null;
		System.out
				.println("Would you like milk and sugar with your coffee (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (answer == null)
			return "no";
		return answer;

	}
}
