// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command;

import model.Environment;
import model.executable.Executable;
import model.executable.Literal;

/**
 * Defines the behaviors for commands that is an action. 
 * @author zhuangbihan
 *
 */
public abstract class ActionCommand extends AbstractCommand {
	
	int offset;
    
    public ActionCommand(int numParams) {
		super(numParams);
		offset = 0;
	}

    /**
     * Scans the list of parameters in groups of ``numParams()``.
     */
	@Override
    public Literal execute(Environment env) {
    	checkParams();
        double ret = 0;
        offset = 0;
        env.getVariablePool().alloc();
        do {
        	ret = getResult(env, ret);
        	offset += numParams();
        } while(offset < getParams().size());
        env.getVariablePool().release();
        return new Literal(ret);
    }
	
	protected double getResult(Environment env, double ret) {
		return ret + run(env);
	}
    
    protected Executable getParam(int index) {
    	return super.getParam(index+offset);
    }
    
    protected abstract double run(Environment env);
}
