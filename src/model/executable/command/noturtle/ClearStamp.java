package model.executable.command.noturtle;

import model.Environment;
import model.executable.command.ActionCommand;

public class ClearStamp extends ActionCommand {

	public ClearStamp() {
		super(0);
	}

	@Override
	protected double run(Environment env) {
		return env.getTurtlePool().clearstamp() ? 1 : 0;
	}

}
