package shapecommands;

import java.awt.Color;
import java.awt.Graphics2D;

import shapefactory.ColorList;
import shapefactory.IShape;
import view.gui.PaintCanvas;
import main.*;

public class DrawOutlineShapeStrategy implements IDrawShapeStrategy {
	private IShape shapeinquestion;
	private Graphics2D graphics;
	private PaintCanvas paintcanvas = PaintCanvas.getInstance();
	
	public DrawOutlineShapeStrategy(IShape newshape) {
		this.shapeinquestion=newshape;
		paintcanvas = PaintCanvas.getInstance();
		graphics = paintcanvas.getGraphics2D();
	}
	

	@Override
	public void draw() {
		
		System.out.println(shapeinquestion.getClass());
		Color color = ColorList.getColor(shapeinquestion.getPrimaryColor());
		graphics.setColor(color);
		point point = shapeinquestion.getstartpoint();
		int width = shapeinquestion.getwidth();
		int height= shapeinquestion.getheight();
		
		System.out.println(point.x);
		System.out.println(point.y); 
		System.out.println(width); 
		System.out.println(height); 
		System.out.println(shapeinquestion.toString());
		
		switch(shapeinquestion.toString()) {
		
		case "RECTANGLE":
			graphics.drawRect(point.x, point.y, width, height);
			System.out.println("HERE");
			break;
		
		case "ELLIPSE":
			graphics.drawOval(point.x, point.y, width, height);
			System.out.println("HERE");
			break;
			
		case "TRIANGLE":
			int[] arrayofxs = {point.x, point.x+width, point.x};
			int[] arrayofys = {point.y, point.y+height, point.y+height};
			graphics.drawPolygon(arrayofxs, arrayofys, 3);
			System.out.println("HERE in triangle");
			break;
		}
		
		

	}

}