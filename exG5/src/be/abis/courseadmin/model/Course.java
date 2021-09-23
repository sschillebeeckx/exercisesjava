package be.abis.courseadmin.model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String title;
	private int numberOfDays;
	private double pricePerDay;
	private boolean priorKnowledgeRequired;	
	private List<Instructor> instructors = new ArrayList<>();
	

	public Course(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
		this.title = title;
		this.numberOfDays = numberOfDays;
		this.pricePerDay = pricePerDay;
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public boolean isPriorKnowledgeRequired() {
		return priorKnowledgeRequired;
	}

	public void setPriorKnowledgeRequired(boolean priorKnowledgeRequired) {
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}

	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}
	
	public void removeInstructor(Instructor instructor) {
		instructors.remove(instructor);
	}
	
	public  double calculatePrice() {
		double totalPrice = numberOfDays * pricePerDay;
		if (!(numberOfDays > 3 && priorKnowledgeRequired)) {
			totalPrice *= 1.21;
		}
		return totalPrice;
	}


}
