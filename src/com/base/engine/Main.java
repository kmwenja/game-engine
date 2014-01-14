package com.base.engine;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;

public class Main
{
    public static void main(String[] args){
        Display.setTitle("Hello World!");
        try{
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
            while(!Display.isCloseRequested()){
                Display.update();
            }
        }
        catch(LWJGLException le){
            le.printStackTrace();
        }
    }
}
