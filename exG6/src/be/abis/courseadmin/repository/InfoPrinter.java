package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InfoPrinter implements Printer {

    public void printSalaryHistory(Instructor i) throws IOException {
        int seniority =0;
        double salary=i.getStartSalary();
        int sAge=i.getStartAge();
        BufferedWriter bw = Files.newBufferedWriter(Paths.get("exG5\\src\\salaryhistory"+i.getFirstName()+".txt"));
        int age=i.calculateAge();
        for (int loopAge=sAge; loopAge<=age ; loopAge+=5) {
            if (loopAge!=sAge) salary=salary*1.03;
            bw.write("Salary of " + i.getFirstName() + " at " + loopAge + " is " + salary + ".\n");
            if (seniority<35){
                seniority+=5;
            } else {
                bw.write("Maximum salary reached.");
                break;
            }
        }
        bw.close();
        System.out.println("salaryhistory"+i.getFirstName()+".txt was created");
    }

    public  void printInfo(Course c) throws IOException {
        this.printInfo(c,"courseinfo"+c.getTitle()+".txt");
    }

    public void printInfo(Course c,String fileName) throws IOException {
        BufferedWriter bw = Files.newBufferedWriter(Paths.get("exG5\\src\\"+fileName));
        double totalPrice = c.calculatePrice();
        bw.write("The " + c.getTitle() + " course takes " + c.getNumberOfDays() + " days and costs " + c.getPricePerDay() + " per day. \nPrior knowledge required: " + c.isPriorKnowledgeRequired() +".\n");

        String label;
        List<Instructor> instructors = c.getInstructors();
        bw.write("There are " + instructors.size() + " instructors for this course:\n");
        for(Instructor instructor: instructors) {
            bw.write(instructor.getFirstName()+"\n");
        }

        if (totalPrice < 500) {
            label = "CHEAP";
        } else if (totalPrice >= 500 && totalPrice <=1500) {
            label = "OK";
        } else {
            label = "EXPENSIVE";
        }

        bw.write("The total price is "+ totalPrice + ". That is " + label + ".");

        bw.close();
        System.out.println("info written to " + fileName);
    }


}
