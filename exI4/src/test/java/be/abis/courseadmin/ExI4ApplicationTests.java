package be.abis.courseadmin;

import be.abis.courseadmin.exception.AgeException;
import be.abis.courseadmin.model.Address;
import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class ExI4ApplicationTests {

    @Test
    public void calculateAge() throws AgeException {
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","België","BE");
        Company c = new Company("ABIS",a);

        Person p1 = new Person(1,"Ann","Smits", LocalDate.of(1985, 6, 28),c);

        assertEquals(36,p1.calculateAge());        //correct value
        //assertEquals(42,p1.calculateAge()); //wrong value
    }

}
