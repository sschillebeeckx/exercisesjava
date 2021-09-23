package be.abis.courseadmin.model;

import java.time.LocalDate;

public class Instructor extends Person{

	private int startAge;
	private double startSalary;
	
	public Instructor(int personNumber,String firstName, String lastName, LocalDate birthDate, Company c, int startAge, double startSalary){
		super(personNumber,firstName,lastName,birthDate,c);
		this.startAge=startAge;
		this.startSalary=startSalary;
	}
	
	public int getStartAge(){
		return startAge;
	}
	
	public void setStartAge(int startAge){
		this.startAge=startAge;
	}
	
	public void setStartSalary(double startSalary){
		this.startSalary=startSalary;
	}
	
	public double getStartSalary(){
		return startSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\nThis Instructor started at age " + this.startAge + "." ;

	}

}