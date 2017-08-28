package view;

import model.info.PaletteInfo;
import model.info.ShapeInfo;

/**
 * Provides the APIs for getting information of the palette and
 * shapes when needed in the view classes.
 * @author zhuangbihan
 *
 */
public interface ViewSupplier {
	
	PaletteInfo getPalette();
	
	ShapeInfo getShapeInfo();

}
