package com.jocata.TranscationSetails.pract;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseClass {
	

	 public static void main(String[] args) {
	        try {
	            Robot robot = new Robot();

	            //
	            // Move mouse cursor to 200, 200
	            //
	            robot.mouseMove(200, 200);

	            robot.MouseWheel("up",10)
	           thread.sleep(1000);
	           robot. MouseWheel("down",10)
	            //
	            // Press the mouse button #1.
	            //
	            robot.mousePress(InputEvent.BUTTON1_MASK);
	            robot.mouseRelease(InputEvent.BUTTON1_MASK);

	            //
	            // Scroll the screen up for a mouse with a wheel support.
	            //
	            robot.mouseWheel(-100);
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	    }
	
	
}
