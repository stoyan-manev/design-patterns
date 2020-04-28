package command;

public class GasButton {
	
	private boolean buttonOn;
	private boolean carPowerOn;
	
	public void switchOn() {
		System.out.println("Car are on");
		System.out.println("Gas are on");
		this.buttonOn = true;
		this.carPowerOn = true;
	}
	
	public void switchOff() {
		System.out.println("Car are off");
		System.out.println("Gas are off");
		this.buttonOn = false;
		this.carPowerOn = false;

	}


}
