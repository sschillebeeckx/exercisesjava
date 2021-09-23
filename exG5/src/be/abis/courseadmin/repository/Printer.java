package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

import java.io.IOException;

public interface Printer {

    public void printSalaryHistory(Instructor i) throws IOException;
    public  void printInfo(Course c) throws IOException;
    public void printInfo(Course c,String fileName) throws IOException;

}
