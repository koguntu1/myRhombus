package com.sunnykeith.rhombus.controller.part3;

/**
 * The Rhombus driver 
 * @author keith Oguntuwase
 *@version 06/03/2019
 */

public class RhombusDriver {

	/**
	 * A RhombusView object to get the user's input values and display the output. 
	 * @param args method
	 */
	public static void main(String[] args) {
		RhombusView view = new RhombusView();
		view.inputRhombusValues();
		view.initializeRhombus();
		view.demoRhombus();
	}

}
