package shapecommands;

import main.Mousehandler;
import main.point;
import shapefactory.IShape;

import java.util.ArrayList;

public class MoveShapeCommand implements ICommand {
	
	private ShapeList listofshapes;
	private Mousehandler mousehandler;
	private int differencex;
	private int differencey;
	private point newpoint;
	
	public MoveShapeCommand(Mousehandler mouse) {
		mousehandler=mouse;
		listofshapes=ShapeList.getInstance();
	}

	@Override
	public void run() {
		
		point startpoint=mousehandler.getstartpoint();
		int startpointX= startpoint.x;
		int startpointY=startpoint.y;
		
		point endpoint=mousehandler.getendpoint();
		int endpointX=endpoint.x;
		int endpointY=endpoint.y;
		
		differencex= endpointX-startpointX;
		differencey= endpointY-startpointY;
		
		for(IShape shape:listofshapes.getlistofselectedshapes())
		{
			
			System.out.println("We are here in moveshapecommand");
			//newpoint=mousehandler.getminpoint();
			newpoint=shape.getstartpoint();
			newpoint.x=newpoint.x+differencex;
			System.out.println(" The new point is ");
			newpoint.y=newpoint.y+differencey;
			shape.setstartpoint(newpoint);
			System.out.println(newpoint.x+" The new point is ,  "+newpoint.y);
			
		}
		
		listofshapes.UpdateCanvas();

	}

}
