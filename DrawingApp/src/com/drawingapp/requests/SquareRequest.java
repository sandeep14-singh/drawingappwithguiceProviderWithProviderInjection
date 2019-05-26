package com.drawingapp.requests;

import javax.inject.Inject;

import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;

public class SquareRequest {	
	Provider<DrawSquare> squareProvider;
	
	@Inject
	public SquareRequest(Provider<DrawSquare> squareProvider){
		this.squareProvider = squareProvider;
	}
	public void makeRequest(){
		DrawSquare d1 = squareProvider.get();
		d1.draw();
		DrawSquare d2 = squareProvider.get();
		d2.draw();
	}		
}
