package shapecommands;

import main.Mousehandler;
import main.point;

public class SelectShapeCommand implements ICommand {
	
	private ShapeList shapelist;
	private Mousehandler mousehandler;

	
	public SelectShapeCommand(Mousehandler mouse) {
		mousehandler=mouse;
		shapelist=ShapeList.getInstance();
	}

	@Override
	public void run() {
		System.out.println("Here giving dimension to selection box");
		point minpointofselectionbox=mousehandler.getminpoint();
		int minpointselectx=minpointofselectionbox.x;
		int minpointselecty=minpointofselectionbox.y;
		point maxpointofselectionbox= mousehandler.getendpoint();
		System.out.println("The  min pointx of selection box is  "+minpointofselectionbox.x);
		System.out.println("The  min pointy of selectionbox is  "+minpointofselectionbox.y);
		System.out.println("The  width of slection box  is  " +mousehandler.getwidth());
		System.out.println("The  height of slection box  is  " +mousehandler.getheight());
		//int maxpointselectx=minpointselectx+mousehandler.getwidth();
		int maxpointselectx=maxpointofselectionbox.x;
		System.out.println("The  maxpointx of slection box  is  " +maxpointselectx);
		//int maxpointselecty=minpointselecty+mousehandler.getheight();
		int maxpointselecty=maxpointofselectionbox.y;
		System.out.println("The  maxpointy of slection box  is  " +maxpointselecty);
		
		shapelist.ShapeSelect(minpointselectx,maxpointselectx,minpointselecty,maxpointselecty);	

	}

}
