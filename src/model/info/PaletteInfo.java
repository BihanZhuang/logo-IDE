package model.info;

import java.util.Map;

import javafx.scene.paint.Color;

/**
 * An object that contains the states of a palette
 * @author Bihan Zhuang
 *
 */
public interface PaletteInfo {
    
    Color getColor(int index);
    
    Map<Integer, Color> listColor();

}
