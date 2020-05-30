package decoratorFacade;

public class BurgerDecorator implements Burger{

	protected Burger decoratedBurger;

	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public String getDescription() {
		return this.decoratedBurger.getDescription();
	}

	@Override
	public double getCost() {
		return this.decoratedBurger.getCost();
	}

}
