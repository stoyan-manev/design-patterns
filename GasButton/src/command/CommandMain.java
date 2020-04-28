package command;

public class CommandMain {

	public static void main(String[] args) {

		Controler remoteController = new Controler();
		GasButton gas = new GasButton();
		Command gasOnCommand = new GasOnCommand(gas);
		Command gasOffCommand = new GasOffCommand(gas);
		
		remoteController.setCommand(gasOnCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(gasOffCommand);
		remoteController.pressButton();

		remoteController.setCommand(gasOnCommand);
		remoteController.pressButton();
	}
	
}
