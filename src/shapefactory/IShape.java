package shapefactory;

import main.*;
import model.*;

public interface IShape {
	point  getstartpoint();
	void setstartpoint(point newpoint);
	int getwidth();
	int getheight();
	ShapeShadingType getShadingType();
	ShapeColor getPrimaryColor();
	ShapeColor getSecondaryColor();
	String toString();
}