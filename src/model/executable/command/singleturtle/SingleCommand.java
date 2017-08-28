// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.singleturtle;

import model.Environment;
import model.executable.command.ActionCommand;
import model.turtle.Turtle;

/**
 * Defines behaviors for commands that operate on one turtle at 
 * a time.
 * @author zhuangbihan
 *
 */
public abstract class SingleCommand extends ActionCommand {

	public SingleCommand(int numParams) {
		super(numParams);
	}

	/**
	 * Applies the function specified by concrete implementation to the 
     * one relevant turtle. 
	 */
	@Override
	public double run(Environment env) {
		return env.getTurtlePool().apply(turtle -> turtleExecute(turtle));
	}
	
	protected abstract double turtleExecute(Turtle turtle);
}
