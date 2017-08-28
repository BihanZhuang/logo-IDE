package model.info;

import java.util.Map;

/**
 * An object that contains the states of a turtle pool
 * @author Mike Liu
 *
 */
public interface PoolInfo {

    int getBackground();
    
    Map<Integer, TurtleInfo> getTurtles();
    
    void stamp(double x, double y, int image);
    
    boolean clearstamp();
}
