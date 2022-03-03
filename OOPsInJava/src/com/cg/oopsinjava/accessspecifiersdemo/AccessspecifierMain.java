package com.cg.oopsinjava.accessspecifiersdemo;

import com.cg.oopsinjava.accessspecifiers.Sample;

public class AccessspecifierMain {

	public static void main(String[] args) {
		Sample sm=new Sample();//because sample class is public you can access anywhere in Project
	        //sm.display(); //as method is not public it is not accessible, you have to make it as public to access in different package
	}
}
