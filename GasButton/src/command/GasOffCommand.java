package command;

public class GasOffCommand implements Command {

	private GasButton gas;
	
	public GasOffCommand(GasButton gas) {
		this.gas = gas;
	}

	@Override
	public void execute() {

		this.gas.switchOff();

	}


	
}
