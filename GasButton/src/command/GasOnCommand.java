package command;

public class GasOnCommand implements Command{
	
	private GasButton gas;
	
	public GasOnCommand(GasButton gas) {
		this.gas = gas;
	}

	@Override
	public void execute() {
		this.gas.switchOn();
	}
}
