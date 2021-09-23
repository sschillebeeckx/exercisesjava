package be.abis.exercise.test;

import be.abis.exercise.model.Circle;
import be.abis.exercise.model.Point;
import be.abis.exercise.model.Rectangle;
import be.abis.exercise.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		Point p = new Point();
		
		List<Shape> shapeList = new ArrayList<>();
		
		shapeList.add(new Circle("red",p,2));
		shapeList.add(new Rectangle("blue",new Point(),2,3));
		
		for (Shape s : shapeList){
			System.out.println("area of the " + s.getClass().getSimpleName() + " = "  + s.area());
		}
		
		
	
		
		

	}

}
