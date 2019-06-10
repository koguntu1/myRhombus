/**
 * 
 */

package com.sunnykeith.rhombus.controller.test;

import java.awt.geom.Point2D;

import com.sunnykeith.rhombus.model.Rhombus;

/** Starting class RhombusDemo
 * @author Keith Oguntuwase
 * @version 6/4/2019
 */
public class RhombusDemo {
 /**
 * Defining the type Rhombus that will initialize the variable and with values
 * to initialize the object.
 */	
	public void testRhombusPart01() {
		Rhombus rhombus = new Rhombus(4.0, 6.5, 4.0, 2.0);
		System.out.println("Top Point Comparision:  ");
		this.displayPointInformation(rhombus.getTopPoint(), 4.0, 6.5);
	 	System.out.println("Bottom Point Comparision:  ");
	 	this.displayPointInformation(rhombus.getBottomPoint(), 4.0, 8.5);
	 	System.out.println("Left Point Comparision:  ");
	 	this.displayPointInformation(rhombus.getLeftPoint(), 2.0, 7.5);
		System.out.println("Right Point Comparision:  ");
		this.displayPointInformation(rhombus.getRightPoint(), 6.0, 7.5);
		System.out.println("\n\nHorizontal Length of Rhombus: \t" + rhombus.getHorizontal());
		System.out.println("Vertical Length of Rhombus: \t" + rhombus.getVertical());
		System.out.println("Area of Rhombus: \t" + rhombus.getArea());
		System.out.println("Length of each Side of Rhombus: \t" + rhombus.getSideLength());	
	}
	
	/**
	 * add testRhombusPart02 to print expected and actual values
	 */
	public void testRhombusPart02()	{
		Rhombus rhombus = new Rhombus(4.0, 6.5, 4.0, 2.0);
		System.out.println("\n\nPerimeter of Rhombus: \t" + rhombus.getPerimeter());
		System.out.println("Ratio of Area of Rhombus: \t" + rhombus.getRatioOfAreaToSquareArea());
		System.out.println("Inradius of Rhombus: \t" + rhombus.getInradius());
	}
		
	private void displayPointInformation(Point2D.Double actualPoint, double expectedX, double expectedY) {
		System.out.println("\tExpected x:\t" + expectedX);
		System.out.println("\tActual x:\t" + actualPoint.getX());
		
		System.out.println("\tExpected y:\t" + expectedY);
		System.out.println("\tActual y:\t" + actualPoint.getY());
	}
	 
}
