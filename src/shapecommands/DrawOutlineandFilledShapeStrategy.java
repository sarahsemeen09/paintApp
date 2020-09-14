package shapecommands;

import java.awt.Color;
import java.awt.Graphics2D;

import shapefactory.ColorList;
import shapefactory.IShape;
import view.gui.PaintCanvas;
import main.*;

public class DrawOutlineandFilledShapeStrategy implements IDrawShapeStrategy {
	private IShape shapeinquestion;
	private Graphics2D graphics1;
	private Graphics2D graphics2;
	private PaintCanvas paintcanvas = PaintCanvas.getInstance();
	
	public DrawOutlineandFilledShapeStrategy(IShape newshape){
		this.shapeinquestion=newshape;
		paintcanvas = PaintCanvas.getInstance();
		graphics1 = paintcanvas.getGraphics2D();
		graphics2 = paintcanvas.getGraphics2D();
	}
	

	@Override
	public void draw() {
		System.out.println(shapeinquestion.getClass());
		Color color1 = ColorList.getColor(shapeinquestion.getPrimaryColor());
		graphics1.setColor(color1);
		
		Color color2 = ColorList.getColor(shapeinquestion.getSecondaryColor());
		graphics2.setColor(color2);
		
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
			graphics2.drawRect(point.x, point.y, width, height);
			graphics1.fillRect(point.x, point.y, width, height);
			System.out.println("HERE");
			break;
		
		case "ELLIPSE":
			graphics2.drawOval(point.x, point.y, width, height);
			graphics1.fillOval(point.x, point.y, width, height);
			System.out.println("HERE");
			break;
			
		case "TRIANGLE":
			int[] arrayofxs = {point.x, point.x+width, point.x};
			int[] arrayofys = {point.y, point.y+height, point.y+height};
			graphics2.drawPolygon(arrayofxs, arrayofys, 3);
			graphics1.fillPolygon(arrayofxs, arrayofys, 3);
			System.out.println("HERE");
			break;
		}
		
		

	}

}

