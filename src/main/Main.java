package main;
import controller.IJPaintController;
import controller.JPaintController;
import model.dialogs.DialogProvider;
import model.interfaces.IDialogProvider;
import model.persistence.ApplicationState;
import shapecommands.*;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.interfaces.IGuiWindow;
import view.interfaces.IUiModule;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class Main {
    public static void main(String[] args){
       // PaintCanvas paintCanvas = new PaintCanvas();
    	PaintCanvas paintCanvas = PaintCanvas.getInstance();
        IGuiWindow guiWindow = new GuiWindow(paintCanvas);
        IUiModule uiModule = new Gui(guiWindow);
       
        ApplicationState appState = new ApplicationState(uiModule);          
        IJPaintController controller = new JPaintController(uiModule, appState);
        controller.setup();
        
        Mousehandler mousehandler=new Mousehandler();
        paintCanvas.addMouseListener(mousehandler);
        CommandCentre.initiate(mousehandler,appState);
        /*Graphics2D graphics2d = paintCanvas.getGraphics2D();
        createshapeCommand n = new createshapeCommand(graphics2d);
        n.makeR(10,20,30,40);//
        

    }
        
}

