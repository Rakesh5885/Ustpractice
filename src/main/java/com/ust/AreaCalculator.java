package com.ust;

import java.util.logging.Logger;

public class AreaCalculator {
	
	public static Logger logger= Logger.getLogger(AreaCalculator.class.getName());
	//Square
	public int area(int side) {
		return side*side;
	}
	
	//Rectangle
	public double area(int length, int breadth) {
		return length*breadth;
	}
	
	//Circle
	public double area(double radius) {
		return 3.14*radius*radius;
	}
	
	//Trangle
	public double area(double base, double height) {
		return 0.5*base*height;
	}
	
	public static void main(String[] args) {
	
		AreaCalculator c =new AreaCalculator();
		logger.info("Area of Square :"+c.area(5));
		logger.info("Area of Rectangle :"+ c.area(4,6));
		logger.info("Area of Circle :"+c.area(1.5));
		logger.info("Area of triangle :"+c.area(4.0,5.0));
		
		
	}

}
