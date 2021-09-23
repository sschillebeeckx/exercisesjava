package be.abis.courseadmin.test;


import be.abis.courseadmin.exception.PersonShouldBeAdultException;
import be.abis.courseadmin.model.Address;
import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.model.Instructor;
import be.abis.courseadmin.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ExH1 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","België","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(2010, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		try {
			System.out.println(p2.getFirstName() +" is " +p2.calculateAge() + " years old.");
		} catch (PersonShouldBeAdultException e) {
			e.printStackTrace();
		}

	}

}
