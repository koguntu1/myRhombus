package com.sunnykeith.rhombus.controller.part3;

import java.util.Scanner;

import com.sunnykeith.rhombus.model.Rhombus;

/**
 * Added RhombusView class
 * 
 * @author keith Oguntuwase
 * @version 06/03/2019
 */

public class RhombusView {
	/**
	 * add instance variables
	 */
	private double topX;
	private double topY;
	private double horizontal;
	private double vertical;
	private Scanner scanner;
	private Rhombus rhombus;

	/**
	 * add constructor with no parameter
	 */
	public RhombusView() {

		this.scanner = new Scanner(System.in);
		this.rhombus = null;
		this.topX = 0.0;
		this.topY = 0.0;
		this.horizontal = 0.0;
		this.vertical = 0.0;
	}

	/**
	 * inputRhombusValues prompt the user for each value and use the Scanner object
	 * to read in each value. Then use those values to create a Rhombus
	 */
	public void inputRhombusValues() {

		System.out.print("Enter the Top Point X-axis: ");
		this.topX = this.scanner.nextDouble();
		System.out.print("Enter the Top Point Y-axis: ");
		this.topY = this.scanner.nextDouble();
		System.out.print("Enter the Horizontal Length: ");
		this.horizontal = this.scanner.nextDouble();
		System.out.print("Enter the this.Vertical Length: ");
		this.vertical = this.scanner.nextDouble();
	}

	/**
	 * initializeRhombus method, initialize the Rhombus instance variable
	 *  using the user's input received in inputRhombusValues.
	 */
	public void initializeRhombus() {
		this.rhombus = new Rhombus(this.topX, this.topY, this.horizontal, this.vertical);
	}

	/**
	 * demoRhombus method displays the returned values of the Rhombus object's
	 *  accessor methods.
	 */
	public void demoRhombus() {
		System.out.println("\n\nTop Point Values: \t" + this.rhombus.getTopPoint());
		System.out.println("Bottom Point Values: \t" + this.rhombus.getBottomPoint());
		System.out.println("Left Point Values: \t" + this.rhombus.getLeftPoint());
		System.out.println("Right Point Values: \t" + this.rhombus.getRightPoint());
		System.out.println("Horizontal Length of Rhombus: \t" + this.rhombus.getHorizontal());
		System.out.println("Vertical Length of Rhombus: \t" + this.rhombus.getVertical());
		System.out.println("Area of Rhombus: \t" + this.rhombus.getArea());
		System.out.println("Length of each Side of Rhombus: \t" + this.rhombus.getSideLength());
		System.out.println("Perimeter of Rhombus: \t" + this.rhombus.getPerimeter());
		System.out.println("Ratio of Area of Rhombus: \t" + this.rhombus.getRatioOfAreaToSquareArea());
		System.out.println("Inradius of Rhombus: \t" + this.rhombus.getInradius());
	}
}
