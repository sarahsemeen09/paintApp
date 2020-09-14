package shapefactory;

import main.point;
import model.ShapeColor;
import model.ShapeShadingType;

public class Rectangle implements IShape {
	
	private point startpoint;
	private int widthofrectangle;
	private int heightofrectangle;
	private ShapeColor primarycolor;
	private ShapeColor secondarycolor;
	private ShapeShadingType shadingtype;
	
	
	public Rectangle(ShapeColor primarycolor, ShapeColor secondarycolor, ShapeShadingType shade, point minpoint, int width, int height) {
		this.primarycolor=primarycolor;
		this.secondarycolor=secondarycolor;
		this.shadingtype=shade;
		this.startpoint=minpoint;
		this.widthofrectangle=width;
		this.heightofrectangle=height;
	}


	@Override
	public point getstartpoint() {
		
		return startpoint;
	}

	@Override
	public void setstartpoint(point newpoint) {
		this.startpoint=newpoint;

	}
	
	@Override
	public int getwidth() {
		
		return widthofrectangle;
	}
	
	@Override
	public int getheight() {
		
		return heightofrectangle;
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
		return "RECTANGLE";
	}

}



