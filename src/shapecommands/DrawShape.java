package shapecommands;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

import model.ShapeShadingType;
import shapefactory.IShape;
import view.gui.PaintCanvas;

public class DrawShape {

	public static void draw(IShape shape){
		PaintCanvas paintcanvas = PaintCanvas.getInstance();
		Graphics2D g2d = paintcanvas.getGraphics2D();
		g2d.setStroke(new BasicStroke(2));
		IDrawShapeStrategy strategy = null;
		
		if(shape.getShadingType() == ShapeShadingType.OUTLINE)
		{
			strategy = new DrawOutlineShapeStrategy(shape);
        }
		
		else if(shape.getShadingType() == ShapeShadingType.FILLED_IN) {
			strategy = new DrawFilledShapeStrategy(shape);
		}
		
		else if(shape.getShadingType() == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
			strategy = new DrawOutlineandFilledShapeStrategy(shape);
		}
		else 
		{
			System.out.print("Invalid Entry");
		}
		System.out.println(strategy.getClass());
		strategy.draw();
       }

}