package vitamin ;
public class BreakState implements State {

	Vitamin vitamin;
	public BreakState(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

	@Override
	public void buyVitamin() {
		System.out.println("Buying vitamin");
		vitamin.setState(vitamin.getBuystate());
	}

	@Override
	public void consumeVitamin() {
		System.out.println("Vitamin Expired, can not use vitamin");
	}

	@Override
	public void breakVitamin() {
		System.out.println("Vitamin Expired");

	}
	public String toString() {
		return "Expired";
	}

}
