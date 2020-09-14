package shapefactory;

import main.*; 
import model.ShapeColor;
import model.ShapeShadingType;

public class Triangle implements IShape {
	private point startpoint;
	private int widthoftriangle;
	private int heightoftriangle;
	private ShapeColor primarycolor;
	private ShapeColor secondarycolor;
	private ShapeShadingType shadingtype;
	

	public Triangle(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shade, point minpoint, int width, int height) {
		this.primarycolor=primarycolor;
		this.secondarycolor=secondarycolor;
		this.shadingtype=shade;
		this.startpoint=minpoint;
		this.widthoftriangle=width;
		this.heightoftriangle=height;
	}
	@Override
	public point getstartpoint() {
		
		 return startpoint;
	}

	@Override
	public void setstartpoint(point newpoint) {
		
		this.startpoint= newpoint;

	}
	@Override
	public int getwidth() {
		
		return widthoftriangle;
	}
	
	@Override
	public int getheight() {
		
		return heightoftriangle;
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
		return "TRIANGLE";
	}


}
