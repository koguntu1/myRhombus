package com.sunnykeith.rhombus.model;

import java.awt.geom.Point2D;

/**
 * Start of the Rhombus class
 * 
 * @author Keith Oguntuwase
 * @version 06/03/2019
 */

public class Rhombus {
 /**
 * The Rhombus instance variables
 */
	private Point2D.Double topPoint;
	private double horizontal;
	private double vertical;
		
	/**
	 * These constructors will be use to initialize the instance variables for Rhombus.
	 * Initialize vertical
	 * @param vertical 
	 * Initialize horizontal
	 * @param horizontal 
	 * Declare xAxis
	 * @param xAxis 
	 * Declared yAxis
	 * @param yAxis 
	 */

	public Rhombus(double xAxis, double yAxis, double horizontal, double vertical) {
		this.topPoint = new Point2D.Double(xAxis, yAxis);
		this.horizontal = horizontal;
		this.vertical = vertical;
	}
	
	/**
	 * The getTopPoint accessor(gettter) to return point2D.double object
	 * and will take no parameter.
	 * @return topPoint
	 */
	
	public Point2D.Double getTopPoint() {
		return this.topPoint;
	}
	
	/**
	 * getter method to return bottomTop
	 * @return bottomPoint
	 */
	public Point2D.Double getBottomPoint() {
		return new Point2D.Double(this.topPoint.getX(), this.topPoint.getY() + vertical);
	}
	
	/**
	 * Method to return the leftTop
	 * @return LeftTop
	 */
	public Point2D.Double getLeftPoint() {
		return new Point2D.Double(this.topPoint.getX() - this.horizontal / 2, this.topPoint.getY() + this.vertical / 2);
	}
	
	/**
	 * Returns the right point
	 * @return rightPoint
	 */
	public Point2D.Double getRightPoint() {
		return new Point2D.Double(this.topPoint.getX() + this.horizontal / 2, this.topPoint.getY() + this.vertical / 2);
	}
	
	/**
	 * get horizontal
	 * @return horizontal
	 */
	public double getHorizontal() {
		return this.horizontal;
	}
	
	/**
	 * Returns vertical
	 * @return vertical
	 */
	
	public double getVertical() {
		return this.vertical;
	}
	
	/**
	 * returns the area
	 * @return the area
	 */
	public double getArea()	{
		return (this.horizontal * this.vertical) / 2;
	}
	
	/**
	 * calculate the side length
	 * @return sideLength
	 */
	public double getSideLength()	{
		return Math.sqrt((Math.pow(this.horizontal, 2) + Math.pow(this.vertical, 2)) / 4);
	}
}

