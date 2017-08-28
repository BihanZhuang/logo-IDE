// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command.math;

import model.Environment;
import util.Constants;

/**
 * Defines behaviors for commands that perform trig calculations.
 * @author zhuangbihan
 *
 */
public abstract class TrigCommand extends MathCommand {

	public TrigCommand(int numParams) {
		super(numParams);
	}

	@Override
	protected double run(Environment env) {
		return Constants.resolveNaN(trig(getParamValue(env, lastParamIndex()) * Constants.RADIAN_PER_DEGREE));
	}
	
	protected abstract double trig(double arg);
}
