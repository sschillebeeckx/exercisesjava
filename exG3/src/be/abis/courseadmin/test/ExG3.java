package be.abis.courseadmin.test;


import be.abis.courseadmin.model.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class ExG3 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		Course co1 = new Course("Java", 2, 300.0, false);
		co1.addInstructor(i1);

		try {
			co1.printInfo("output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
