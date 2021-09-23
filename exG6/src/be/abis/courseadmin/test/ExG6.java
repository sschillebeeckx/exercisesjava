package be.abis.courseadmin.test;


import be.abis.courseadmin.model.*;
import be.abis.courseadmin.repository.InfoPrinter;
import be.abis.courseadmin.repository.Printer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ExG6 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(i1);

		Collections.sort(persons);

		for (Person p: persons){
			System.out.println(p);
		}



	}

}
