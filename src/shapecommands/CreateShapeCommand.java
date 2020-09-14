package shapecommands;

import main.Mousehandler;
import main.point;
import model.ShapeColor;
import model.ShapeShadingType;
import model.interfaces.IApplicationState;
import shapefactory.IShape;
import shapefactory.IShapeFactory;

public class CreateShapeCommand implements ICommand {
	
	private static Mousehandler mousehandler;
	private static ShapeList shapelistofshapes;
	private static IApplicationState applicationstate;
	private IShape shapetodraw;
	
	public CreateShapeCommand(Mousehandler mouse, IApplicationState app) {
		mousehandler=mouse;
		applicationstate=app;
		shapelistofshapes = ShapeList.getInstance();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		point minpoint=mousehandler.getminpoint();
		int width=mousehandler.getwidth();
		int height=mousehandler.getheight();
		ShapeColor primarycolor;
		primarycolor=applicationstate.getActivePrimaryColor();
		ShapeColor secondarycolor;
		secondarycolor=applicationstate.getActiveSecondaryColor();
		
		ShapeShadingType shadingtype=applicationstate.getActiveShapeShadingType();
		
		switch(applicationstate.getActiveShapeType()) {
		case ELLIPSE:
			shapetodraw = IShapeFactory.createEllipse(primarycolor, secondarycolor, shadingtype, minpoint, width, height);
			break;
		case RECTANGLE:
			shapetodraw = IShapeFactory.createRectangle(primarycolor, secondarycolor, shadingtype, minpoint, width, height);
			break;
		case TRIANGLE:
			shapetodraw = IShapeFactory.createTriangle(primarycolor, secondarycolor, shadingtype, minpoint, width, height);
			break;
			
		default:
			break;
		}
		
		shapelistofshapes.addShape(shapetodraw);

	}

}
