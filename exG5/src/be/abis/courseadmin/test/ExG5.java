package be.abis.courseadmin.test;


import be.abis.courseadmin.model.*;
import be.abis.courseadmin.repository.InfoPrinter;
import be.abis.courseadmin.repository.Printer;

import java.io.IOException;
import java.time.LocalDate;

public class ExG5 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		Course co1 = new Course("Java", 2, 300.0, false);
		co1.addInstructor(i1);

		Printer printer = new InfoPrinter();

		try {
			printer.printInfo(co1,"info.txt");
			printer.printSalaryHistory(i1);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
