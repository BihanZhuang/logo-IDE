// This entire file is part of my masterpiece.
// Bihan Zhuang
package model.executable.command;

import java.util.ArrayList;
import java.util.List;

import model.Environment;
import model.executable.Executable;
import util.SLogoException;

/**
 * Provides a skeletal implementation of the <code>Command</code> interface
 * @author Mike Liu
 * @author Bihan Zhuang
 *
 */
public abstract class AbstractCommand implements Command {

    private List<Executable> myParams;
    private int numParams;
    
    public AbstractCommand(int numParams) {
        myParams = new ArrayList<>();
        this.numParams = numParams;
    }
    
    @Override
    public Command copy() {
        Command ret = newInstance();
    	myParams.forEach(exec -> ret.addParam(exec.copy()));
    	return ret;
    }
    
    @Override
    public Command newInstance() {
        try {
            return getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SLogoException(SLogoException.INSTANTIATION_ERROR);
        }
    }
    
    @Override
    public int numParams() {
    	return numParams;
    }
    
    @Override
    public void addParam(Executable exec) {
        myParams.add(exec);
    }
    
    protected int lastParamIndex() {
    	return myParams.size()-1;
    }
    
    protected int paramsLength() {
    	return myParams.size();
    }
    
    protected void checkParams() {
    	checkParamsLength();
    	checkParamsGrouping();
    }
    
    protected void checkParamsLength() {
    	if(myParams.size() < numParams) {
            throw new SLogoException(SLogoException.WRONG_NUM_PARAMS);
        }
    }
    
    protected void checkParamsGrouping() {
    	if(numParams() != 0 && myParams.size() % numParams() != 0) {
    		throw new SLogoException(SLogoException.WRONG_NUM_PARAMS);
    	}
    }

    protected List<Executable> getParams() {
    	return myParams;
    }
    
    protected Executable getParam(int index) {
    	return myParams.get(index);
    }
    
    protected double getParamValue(Environment env, int index) {
        return getParam(index).execute(env).getValue();
    }
}
