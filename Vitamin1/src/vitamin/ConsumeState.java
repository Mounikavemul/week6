package vitamin;
public class ConsumeState implements State {

	Vitamin vitamin;
	public ConsumeState(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

	@Override
	public void buyVitamin() {
		System.out.println("Vitamin already brought");	
		vitamin.setState(vitamin.getBuystate());

	}

	@Override
	public void consumeVitamin() {
		System.out.println("Vitamins Consumed");
	}

	@Override
	public void breakVitamin() {
	
		System.out.println("Vitamin expired");
		vitamin.setState(vitamin.getBreakstate());
	}
	public String toString()
	{
		return "Vitamin Consumed";
	}
}
