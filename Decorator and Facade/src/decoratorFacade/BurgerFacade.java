package decoratorFacade;

public class BurgerFacade {
	
	private Burger classic;
	private Burger classicWithEgg;
	private Burger classicWithCheese;
	
	public BurgerFacade(){
		
		this.classic = new ClassicBurger();
		this.classicWithEgg = new EggDecorator(classic);
		this.classicWithCheese = new CheeseDecorator(classic);
	}
	
	
	public void getClassicBurger(){
		System.out.println("Burger: " + this.classic.getDescription());
		System.out.println("Cost: " + this.classic.getCost() + " $");
		System.out.println();
	}
	
	public void getClassicBurgerCheese(){
		System.out.println("Burger: " + this.classicWithCheese.getDescription());
		System.out.println("Cost: " + this.classicWithCheese.getCost() + " $");
		System.out.println();
	}
	
	public void getClassicBurgerEgg(){
		System.out.println("Burger: " + this.classicWithEgg.getDescription());
		System.out.println("Cost: " + this.classicWithEgg.getCost() + " $");
		System.out.println();
	}

}
