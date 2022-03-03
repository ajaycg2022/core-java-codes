package com.cg.oopsinjava.abstraction;

public class Rectangle extends Shape {

double width,length,are,perimeter;
public Rectangle(String color,double width,double length) {
	super(color);
	this.width=width;
	this.length=length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public void area() {
	System.out.println("area of "+(length*width));
	System.out.println("area of "+(2*(length+width)));
}
}





