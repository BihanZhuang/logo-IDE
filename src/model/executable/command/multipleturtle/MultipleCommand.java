// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.multipleturtle;

import model.Environment;
import model.executable.Literal;
import model.executable.command.ActionCommand;
import model.turtle.Turtle;

/**
 * Defines behaviors for commands that operate on multiple turtles 
 * at once.
 * @author zhuangbihan
 *
 */
public abstract class MultipleCommand extends ActionCommand {
	
	private boolean executed;
	private Literal myValue;

	public MultipleCommand(int numParams) {
		super(numParams);
		executed = false;
	}
    
	/**
	 * Ensures that the command is executed only once in a nested
	 * situation to prevent infinite looping. 
	 */
    @Override
    public Literal execute(Environment env) {
    	if(!executed) {
        	myValue = super.execute(env);
        	executed = true;
        }
        return myValue;
    }
	
    /**
     * Applies the function specified by concrete implementation to
     * relevant turtles at once. 
     */
	@Override
	public double run(Environment env) {
		return env.getTurtlePool().applyAll(turtle -> turtleExecute(env, turtle));
    }
	
	protected abstract double turtleExecute(Environment env, Turtle turtle);

}
