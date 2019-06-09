/**
 * 
 */

package com.sunnykeith.rhombus.controller.test;

import com.sunnykeith.rhombus.model.Rhombus;

/** Starting class RhombusDemo
 * @author Keith Oguntuwase
 * @version 6/4/2019
 */
public class RhombusDemo {
 /**
 * Defining the type Rhombus that will initailize the variable and with values
 * to initialize the object.
 */	
	public void testRhombusPart01() {
		Rhombus rhombus = new Rhombus(4.0, 6.5, 4.0, 2.0);
		System.out.println("Top Point Comparision:  ");
	 	System.out.println("Bottom Point Comparision:  ");
	 	System.out.println("Left Point Comparision:  ");
		System.out.println("Right Point Comparision:  ");
		System.out.println("\n\nHorizontal Length of Rhombus: \t" + rhombus.getHorizontal());
		System.out.println("Vertical Length of Rhombus: \t" + rhombus.getVertical());
		System.out.println("Area of Rhombus: \t" + rhombus.getArea());
		System.out.println("Length of each Side of Rhombus: \t" + rhombus.getSideLength());
	
	}
	/*	
	private void displayPointInformation(Point2D.Double actualPoint, double expectedX, double expectedY) {
		System.out.println("\tExpected x:\t" + expectedX);
		System.out.println("\tActual x:\t" + actualPoint.getX());
		
		System.out.println("\tExpected y:\t" + expectedY);
		System.out.println("\tActual y:\t" + actualPoint.getY());
	}
	 */
}
