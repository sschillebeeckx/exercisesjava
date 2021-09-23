package be.abis.courseadmin.test;


import be.abis.courseadmin.exception.AgeException;
import be.abis.courseadmin.model.Address;
import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.model.Instructor;
import be.abis.courseadmin.model.Person;

import java.time.LocalDate;

public class ExI1 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","België","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(2000, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		try {
			System.out.println(i1.getFirstName() +" is " +i1.calculateAge() + " years old.");
		} catch (AgeException e) {
			e.printStackTrace();
		}

	}

}
