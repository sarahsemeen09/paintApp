package shapefactory;

import main.*;
import model.*;
public class IShapeFactory {
	
	public static IShape createEllipse(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shadetype, point startpoint, int width, int height) {
		return new Ellipse(primarycolor, secondarycolor, shadetype, startpoint, width, height);
	}
	
	public static IShape createRectangle(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shadetype, point startpoint, int width, int height) {
		return new Rectangle(primarycolor, secondarycolor, shadetype, startpoint, width, height);
	}
	
	public static IShape createTriangle(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shadetype, point startpoint, int width, int height) {
		return new Triangle(primarycolor, secondarycolor, shadetype, startpoint, width, height);
	}
	
}
