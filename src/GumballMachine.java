
public class GumballMachine {
		State soldOutState;
		State noQuarterState;
		State hasQuarterState;
		State soldState;
		
		State State = soldOutState;
		int count = 0;
		
		public GumballMachine(int numberGumballs) {
			soldOutState = new SoldOutState(this);
			noQuarterState = new NoQuarterState(this);
			hasQuarterState = new HasQuarterState(this);
			soldState = new SoldState(this);
			this.count = numberGumballs;
			if (numberGumballs > 0) {
				State = noQuarterState;
			}
		}
		
		public void insertQuarter() {
			State.insertQuarter();
		}
		
		public void ejectQuarter() {
			State.ejectQuarter();
		}
		
		public void turnCrank() {
			State.turnCrank();
			State.dispense();
		}
		
		void setState(State state) {
			this.State = state;
		}
		
		void releaseBall() {
			System.out.println("A gumball come roolling out the slot.....");
			if (count != 0) {
				count = count - 1;
			}
		}
	         //More methods here including geetters for each Stste

		public State getSoldState() {
			// TODO Auto-generated method stub
			return soldState;
		}

		public State getNoQuarterState() {
			// TODO Auto-generated method stub
			return noQuarterState;
		}

		public State getHasQuarterState() {
			// TODO Auto-generated method stub
			return hasQuarterState;
		}

		public int getCount() {
			// TODO Auto-generated method stub
			return count;
		}

		public State getSoldOutState() {
			// TODO Auto-generated method stub
			return soldOutState;
		}
	}



