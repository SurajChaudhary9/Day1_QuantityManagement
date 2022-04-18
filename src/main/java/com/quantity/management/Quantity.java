/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 17-Apr-2022
 */

package com.quantity.management;

import java.util.Scanner;

public class Quantity {

	public static void main(String[] args) {

		double feet;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter feet:");
		feet = in.nextDouble();

		double inches = feet * 12;

		System.out.println(inches + " Inches");

	}
//1 foot = 12 inch
//foot 

//
	public boolean compare(double feet, double inches) {
		if (inches == 12 * feet) {
			return true;
		}
		return false;

	}
}