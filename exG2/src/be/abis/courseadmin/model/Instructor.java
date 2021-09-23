package be.abis.courseadmin.model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;

public class Instructor extends Person{

	private int startAge;
	private double startSalary;
	
	public Instructor(int personNumber,String firstName, String lastName,LocalDate birthDate, Company c, int startAge, double startSalary){
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
	
	public void printSalaryHistory() throws IOException{
		 int seniority =0;		 
		 double salary=startSalary;
		 BufferedWriter bw = Files.newBufferedWriter(Paths.get("exG2\\src\\salaryhistory"+this.getFirstName()+".txt"));
		 int age=calculateAge();
		 for (int loopAge=startAge; loopAge<=age ; loopAge+=5) {
			if (loopAge!=startAge) salary=salary*1.03;
			bw.write("Salary of " + this.getFirstName() + " at " + loopAge + " is " + salary + ".\n");
			if (seniority<35){
			   seniority+=5;
			} else {
				bw.write("Maximum salary reached.");
				break;
			}
	     }
		 bw.close();
		 System.out.println("salaryhistory"+this.getFirstName()+".txt was created");
	}
	

}