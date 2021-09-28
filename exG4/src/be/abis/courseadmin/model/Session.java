package be.abis.courseadmin.model;

import java.time.LocalDate;

public abstract class Session {

    private LocalDate startDate;
    private Course course;
    private Company location;
    private Instructor instructor;

    public Session(LocalDate startDate, Course course, Company location, Instructor instructor) {
        this.startDate = startDate;
        this.course = course;
        this.location = location;
        this.instructor = instructor;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Session{" +
                "startDate=" + startDate +
                ", course=" + course.getTitle() +
                ", location=" + location.getName() +
                ", instructor=" + instructor.getFirstName() +
                '}';
    }


    public abstract Company getOrganizer();
}
