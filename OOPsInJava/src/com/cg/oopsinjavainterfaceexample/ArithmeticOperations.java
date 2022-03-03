package com.cg.oopsinjavainterfaceexample;

public interface ArithmeticOperations {
	//we can define the variables in interface , but by default variables are public,static and final
	
	int b=65;//this is by default public,static and final
	// you can not define normal variable in interface , but we can define normal variable in abstract
	public static final int a = 55; // you don't have to declare public static final here, it is by default
	void add(); //by default methods are public here in interfaces
	void sub();
	void mul();
	void div();
	void mod();
	
	// interface does not allow for constructor
	

}
