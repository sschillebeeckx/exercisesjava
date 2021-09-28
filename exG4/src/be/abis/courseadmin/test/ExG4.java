package be.abis.courseadmin.test;


import be.abis.courseadmin.model.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ExG4 {

	public static void main(String[] args) throws IOException {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       Instructor i1 = new Instructor(3,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,23, 2000.0);

		Course co1 = new Course("Java", 2, 300.0, false);
		co1.addInstructor(i1);
		//co1.addInstructor(i1);
		co1.addInstructor(new Instructor(7,"Gie", "Indesteege", LocalDate.of(1958, 8, 5), c,27, 1500.0));

		Person[] persons ={p1,p2,i1};

		for (Person pers : persons){
			System.out.println(pers);
			if (pers instanceof Instructor){
				((Instructor) pers).printSalaryHistory();
			}

		}

		Address a2 = new Address("Marais","1","1000","Brussels","Belgium","BE");
		Company c2 = new Company("BNP",a2);

		//Session ses1 = new Session(LocalDate.of(2021,9,27),co1,c,i1);
		PublicSession ps = new PublicSession(LocalDate.of(2021,10,28),co1,c,i1);
		CompanySession cs = new CompanySession(LocalDate.of(2021,10,28),co1,c,i1,6,c2);

		Session[] sessions = {ps,cs};
		for (Session s: sessions){
			System.out.println(s);

			System.out.println(s.getOrganizer().getName());
		}



	}

}
