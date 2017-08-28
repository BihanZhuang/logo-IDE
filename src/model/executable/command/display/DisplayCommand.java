// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.display;

import model.Environment;
import model.executable.command.ActionCommand;

/**
 * Defines the behaviors for commands that can alter the display
 * of the workspace.
 * @author zhuangbihan
 *
 */
public abstract class DisplayCommand extends ActionCommand {

	public DisplayCommand(int numParams) {
		super(numParams);
	}
	
	@Override 
	protected double getResult(Environment env, double ret) {
		return run(env);
	}

	protected abstract double run(Environment env);
}
