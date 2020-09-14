package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import model.interfaces.*;
import shapecommands.CommandCentre;

public class Mousehandler extends MouseAdapter 
{
	//private point startpoint=new point(0,0);
	//private point startpoint;
	private point startpoint=new point(0,0);
	private point endpoint=new point(0,0);
	private point minpoint=new point(0,0);
	private int width;
	private int height;
	
	public Mousehandler() {
		super();
	}
	
	public void helper()
	{
		if(startpoint.x<endpoint.x)
		{
			minpoint.x=startpoint.x;
		}
		else 
			minpoint.x=endpoint.x;
		
		if(startpoint.y<endpoint.y)
		{
			minpoint.y=startpoint.y;
		}
		else
			minpoint.y=endpoint.y;
		
		width = Math.abs(startpoint.x - endpoint.x);
		height= Math.abs(startpoint.y - endpoint.y);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		int x= e.getX();
		int y= e.getY();
		startpoint.x=x;
		startpoint.y=y;
		helper();//
		System.out.print("\n");
		System.out.print(startpoint.x+ ", " +startpoint.y);
		System.out.print("\n");
		//CommandCentre.appfunctions();	
	}
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		int x= e.getX();
		int y= e.getY();
		endpoint.x=x; 
		endpoint.y=y;
		helper();
		System.out.print(endpoint.x + ", " +endpoint.y);
		System.out.print("\n");
		System.out.print("Min Point");
		System.out.print(minpoint.x + ", " +minpoint.y);
		System.out.print("\n");
		System.out.print("Width: " +width);
		System.out.print("\n");
		System.out.print("Height: " +height);
		CommandCentre.appfunctions();
		
	}
	
	public point getminpoint() {
		return minpoint;
	}
	
	public int getminpointx() {
		return minpoint.x;
	}
	
	public int getminpointy() {
		return minpoint.y;
	}
	public int getwidth() {
		return width;
	}
	
	public int getheight() {
		return height;
	}
	
	public point getendpoint() {
		return endpoint;
	}
	
	public point getstartpoint() {
		return startpoint;
	}
	
	public int getstartpointx() {
		return startpoint.x;
	}
	
	public int getstartpointy() {
		return startpoint.y;
	}
   
	
	/*public void helper()
	{
		if(startpoint.x<endpoint.x)
		{
			minpoint.x=startpoint.x;
		}
		else 
			minpoint.x=endpoint.x;
		
		if(startpoint.y<endpoint.y)
		{
			minpoint.y=startpoint.y;
		}
		else
			minpoint.y=endpoint.y;
		
		width = Math.abs(startpoint.x - endpoint.x);
		height= Math.abs(startpoint.y - endpoint.y);
		
	}*/

}
