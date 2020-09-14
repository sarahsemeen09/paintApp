package shapefactory;

import main.point;
import model.ShapeColor;
import model.ShapeShadingType;
public class Ellipse implements IShape {
	
	private point startpoint;
	private int widthofellipse;
	private int heightofellipse;
    private ShapeColor primarycolor;
	private ShapeColor secondarycolor;
	private ShapeShadingType shadingtype;


	public Ellipse(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shade, point minpoint, int width, int height) {
		this.primarycolor=primarycolor;
		this.secondarycolor=secondarycolor;
		this.shadingtype=shade;
		this.startpoint=minpoint;
		this.widthofellipse=width;
		this.heightofellipse=height;
	}


	@Override
	public point getstartpoint() {
		System.out.print("Here in ellipse construction. The minpoint is  ");
		System.out.print(startpoint.x+", "+startpoint.y);
		return startpoint;
	}

	@Override
	public void setstartpoint(point newpoint) {
		
		this.startpoint= newpoint;
		
	}
	
	@Override
	public int getwidth() {
		
		return widthofellipse;
	}
	
	@Override
	public int getheight() {
		
		return heightofellipse;
	}

	@Override
	public ShapeShadingType getShadingType() {
		
		return shadingtype;
	}

	@Override
	public ShapeColor getPrimaryColor() {
		
		return primarycolor;
	}

	@Override
	public ShapeColor getSecondaryColor() {
		
		return secondarycolor;
	}
	
	@Override
	public String toString() {
		return "ELLIPSE";
	}

}
