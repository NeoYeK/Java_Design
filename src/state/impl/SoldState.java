package state.impl;

import state.GumballMachine;
import state.State;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait,we're already giving you a gumball");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry,you alread turned the crank");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does't get you another gumball !");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0)
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		else {
			System.out.println("Oops,out of gumballs !");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
