package com.drawingapp.services;

import javax.inject.Inject;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;

public class DrawSquare implements DrawShape {
	
	private String color;
	private Integer edge;
	Thread t = new Thread(() -> System.out.println("Drawing Square of color : " + color + " and edge : " + edge));
	
	@Inject
	public DrawSquare(@SquareColorValue String color, @EdgeSize Integer edge){
		this.color = color;
		this.edge = edge;
	}
	
	@Override
	public void draw() {
		t.start();		
	}	

}
