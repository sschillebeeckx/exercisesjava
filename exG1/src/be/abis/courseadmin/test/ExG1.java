package be.abis.courseadmin.test;


import be.abis.courseadmin.model.Address;
import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.model.Person;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class ExG1 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Ann","Smits",LocalDate.of(1985, 6, 28),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       
       try ( BufferedWriter bw = Files.newBufferedWriter(Paths.get("exG1\\src\\personinfo.txt"));){
    	   bw.write(p1.toString() + "\n");
    	   bw.write(p2.toString() + "\n"); 
    	   System.out.println("persons written to file");
       } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       

	}

}
