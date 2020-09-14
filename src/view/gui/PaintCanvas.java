package view.gui;

import javax.swing.JComponent;
import java.awt.*;

public class PaintCanvas extends JComponent {
	private static final PaintCanvas instance = new PaintCanvas();
	
	private PaintCanvas() {  } 

    public Graphics2D getGraphics2D() {
        return (Graphics2D)getGraphics();
    }
    
    public static PaintCanvas getInstance() {// I added this
    	return instance;
    }
    
    public void clearcanvas() {
    	Graphics2D graphics=instance.getGraphics2D();
    	graphics.setColor(Color.white);
    	graphics.setStroke(new BasicStroke(5));
    	graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
