package shapecommands;

import java.util.ArrayList;

import main.point;
import shapefactory.IShape;
import view.gui.PaintCanvas;

public class ShapeList {
	public static ArrayList<IShape> listofshapes;
	public static IShape shapeselected;
	private static final ShapeList instance = new ShapeList();
	public static ArrayList<IShape> listofshapesSelected;
	//public point minpointofshape;
	
	private ShapeList() {
		listofshapes = new ArrayList<IShape>();
		listofshapesSelected=new ArrayList<IShape>();
	}
	
	public void addShape(IShape newshape) {
		listofshapes.add(newshape);
		System.out.println("Adding new Shape");
		for (IShape shape : listofshapes) { 
			System.out.println(" "+shape.toString());
		}
		drawShape(newshape);
	}
	
	public void drawShape(IShape shape) {
		DrawShape.draw(shape);
	}

	public static ShapeList getInstance() {
		return instance; 
	}
	
	public ArrayList<IShape> ShapeSelect(int minpointselectx,int maxpointselectx,int minpointselecty,int maxpointselecty){
		
		for(IShape shape:listofshapes) {
			
			System.out.println("The  min pointx of shape is  "+shape.getstartpoint());
			//System.out.println("The  min pointy of shape is  "+minpointYofshape);
			
			
			point minpointofshape= shape.getstartpoint();
			//the start point 
			int minpointXofshape=minpointofshape.x;
			int minpointYofshape=minpointofshape.y;
			System.out.println("The  min pointx of shape is  "+minpointXofshape);
			System.out.println("The  min pointy of shape is  "+minpointYofshape);
			System.out.println("The  width of shape  is  " +shape.getwidth());
			System.out.println("The  height of shape   is  " +shape.getheight());
			
			//the end point 
			
			int maxpointXofshape= minpointXofshape +shape.getwidth();
			System.out.println("The  maxpointx of shape  is  " +maxpointXofshape);
			int maxpointYofshape= minpointYofshape +shape.getheight();
			System.out.println("The  maxpointy of shape  is  " +maxpointYofshape);
			//checking for shapes that are not inside the selection box
			/*if((minpointselectx > maxpointXofshape)||( minpointXofshape > maxpointselectx)) {
				continue;//ignore shapes that are left of each other
			}
			
			else if((minpointselecty > maxpointYofshape)||(minpointYofshape > maxpointselecty)) {
				continue;//ignore overlapping shapes
			}
			
			else*/
			if((minpointXofshape>=minpointselectx && minpointXofshape<=maxpointselectx && minpointYofshape>=minpointselecty && minpointYofshape<=maxpointselecty )) {
			listofshapesSelected.add(shape);
			}
			
			}
			
			System.out.println("Selected Shape");
			for (IShape everyshape : listofshapesSelected) 
			{ 
				System.out.println(" "+everyshape.toString());
			
		    }
			
		return listofshapesSelected;
		
	}
	
	public ArrayList<IShape> getlistofselectedshapes(){
		
		return listofshapesSelected;
	}
	
	public void UpdateCanvas() {
		PaintCanvas paintcanvas=PaintCanvas.getInstance();
		paintcanvas.clearcanvas();
		for(IShape shapes:listofshapes) {
			DrawShape.draw(shapes);
		}
	}

}
