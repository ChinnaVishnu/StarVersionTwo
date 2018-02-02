package com.jocata.TranscationSetails.pract;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Test {

	public static void main(String[] args) throws AWTException, InterruptedException{
		
		
		Thread.sleep(5000);
	        Robot robot = new Robot();

	        robot.mouseMove(200, 200);

	        robot.mousePress(InputEvent.BUTTON1_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	        
	      

	
}
}