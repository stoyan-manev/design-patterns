package decoratorFacade;

public class EggDecorator extends BurgerDecorator {

	public EggDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	
	public String getDescription(){
		return decoratedBurger.getDescription() + " with egg";
	}
	
	public double getCost(){
		return decoratedBurger.getCost() + 1.00;
	}

}
