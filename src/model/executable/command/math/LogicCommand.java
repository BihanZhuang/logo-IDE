// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.math;

import model.Environment;

/**
 * Defines behaviors for commands that do logical operations.
 * @author zhuangbihan
 *
 */
public abstract class LogicCommand extends MathCommand {

	public LogicCommand(int numParams) {
		super(numParams);
	}

	@Override
	protected double run(Environment env) {
		boolean result = true;
		for(int i=0; i<paramsLength()-1; i++) {
			result = result && logic(getParamValue(env, i), getParamValue(env, i+1));
		}
		return result ? 1:0;
	}
	
	protected abstract boolean logic(double arg0, double arg1);

}
