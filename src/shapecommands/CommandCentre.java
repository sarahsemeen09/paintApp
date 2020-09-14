package shapecommands;

import main.Mousehandler;
import model.interfaces.IApplicationState;
import java.util.ArrayList;
import shapefactory.IShape;

public class CommandCentre {
	private static Mousehandler mousehandler;
	private static ShapeList shapelistofshapes;
	private static IApplicationState applicationstate;
	private static ICommand command=null;
	
	public static void initiate(Mousehandler mouse, IApplicationState app ) {
		mousehandler=mouse;
		applicationstate=app;
		shapelistofshapes=ShapeList.getInstance();
	}
	
	public static void appfunctions() {
		switch(applicationstate.getActiveStartAndEndPointMode()) {
		
		case DRAW:
			command= new CreateShapeCommand(mousehandler,applicationstate);
			System.out.println("HERE in command");
			break;
		case SELECT:
			command= new SelectShapeCommand(mousehandler);
			System.out.println("HERE in selectcommand");
			break;
		case MOVE:
			command=new MoveShapeCommand(mousehandler);
			System.out.println("HERE in movecommand");
			break;
		default:
			break;
			
		}
		command.run();
	}

}
