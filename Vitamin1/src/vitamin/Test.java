package vitamin;

import vitamin.Vitamin;

public class Test {

	public static void main(String[] args) {

		VitaminBuilder vitamins=new VitaminBuilder();
		Vitamin builds=vitamins.addChemical().addWater().build();
		
		System.out.println();
		builds.buyVitamin();
		builds.breakVitamin();
		builds.consumeVitamin();
		builds.buyVitamin();
		System.out.println();
	}

}
