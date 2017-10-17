
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballmachine) {
		this.gumballMachine = gumballmachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert a quarter, the machine is sold out");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there are no gumball");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");

	}

}
