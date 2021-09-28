package be.abis.courseadmin.model;

import java.time.LocalDate;

public class PublicSession extends Session {

    private static final Company ABIS = new Company("ABIS",new Address("Diestsevest","32 bus 4B","3000","Leuven","België","BE"));

    public PublicSession(LocalDate startDate, Course course, Company location, Instructor instructor) {
        super(startDate, course, location, instructor);
    }

    public Company getOrganizer(){
        return ABIS;
    }
}
