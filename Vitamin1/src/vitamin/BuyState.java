package vitamin;
public class BuyState implements State {

	Vitamin vitamin;
	
	public BuyState(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

	@Override
	public void buyVitamin() {
		System.out.println("Buying Vitamin");

	}

	@Override
	public void consumeVitamin() {
		System.out.println("Vitamins Consumed");
		vitamin.setState(vitamin.getConsumestate());	

	}

	@Override
	public void breakVitamin() {
		System.out.println("Vitamin Expired");
		vitamin.setState(vitamin.getBreakstate());
	}
	public String toString()
	{
		return "brought";
	}

}
