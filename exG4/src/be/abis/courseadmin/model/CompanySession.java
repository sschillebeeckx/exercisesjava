package be.abis.courseadmin.model;

import java.time.LocalDate;

public class CompanySession extends Session {

    private int nrOfEnrolments;
    private Company organizer;


    public CompanySession(LocalDate startDate, Course course, Company location, Instructor instructor, int nrOfEnrolments, Company organizer) {
        super(startDate, course, location, instructor);
        this.nrOfEnrolments = nrOfEnrolments;
        this.organizer = organizer;
    }

    public int getNrOfEnrolments() {
        return nrOfEnrolments;
    }

    public void setNrOfEnrolments(int nrOfEnrolments) {
        this.nrOfEnrolments = nrOfEnrolments;
    }

    public Company getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }

    @Override
    public String toString() {
        return "CompanySession{" + super.toString() +
                " nrOfEnrolments=" + nrOfEnrolments +
                ", organizer=" + organizer.getName() +
                '}';
    }
}
