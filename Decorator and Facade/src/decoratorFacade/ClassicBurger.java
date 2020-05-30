package decoratorFacade;

public class ClassicBurger implements Burger {

	@Override
	public String getDescription() {

		return "Classic burger";
	}

	@Override
	public double getCost() {
		
		return 2.00;
	}

}
