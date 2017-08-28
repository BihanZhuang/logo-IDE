// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.math;

import model.Environment;

/**
 * Defines the behaviors for commands that do arithemtic
 * calculations. 
 * @author zhuangbihan
 *
 */
public abstract class ArithCommand extends MathCommand {

	public ArithCommand(int numParams) {
		super(numParams);
	}
	
	@Override
	protected double run(Environment env) {
		double result = getParamValue(env, 0);
		for(int i = 1; i < paramsLength(); i++) {
			result = arithmetic(result, getParamValue(env, i));
		}
		return result;
	}
	
	protected abstract double arithmetic(double arg0, double arg1);
}
