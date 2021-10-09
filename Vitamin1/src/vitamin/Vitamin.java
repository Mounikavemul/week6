package vitamin ;
public class Vitamin {
	
	State state;
	BuyState buystate;
	ConsumeState consumestate;
	BreakState breakstate;
	

	public Vitamin() {
		buystate = new BuyState(this);
		consumestate = new ConsumeState(this);
		breakstate = new BreakState(this);
		state = buystate;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public BuyState getBuystate() {
		return buystate;
	}

	public ConsumeState getConsumestate() {
		return consumestate;
	}

	public BreakState getBreakstate() {
		return breakstate;
	}
	
	public void buyVitamin() {
		state.buyVitamin();
	}
	
	public void consumeVitamin() {
		state.consumeVitamin();
	}
	
	public void breakVitamin() {
		state.breakVitamin();
	}
	
	public String toString() {
		StringBuffer buffer=new StringBuffer("\nVitamin State  \nVitamin "+state);
		String s=new String(buffer);
		return s;
	}
}
