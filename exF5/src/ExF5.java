import java.io.IOException;
import java.time.LocalDate;

public class ExF5 {

	public static void main(String[] args) {

		try {
			LocalDate birthDateSandy = LocalDate.of(1978, 4, 10);
			Instructor i1 = new Instructor("Sandy", "Schillebeeckx", birthDateSandy, 27, 2100.0);
			Instructor i2 = new Instructor("Gie", "Indesteege", LocalDate.of(1958, 8, 5), 23, 2000.0);
			Instructor i3 = new Instructor("Peter", "Vanroose", LocalDate.of(1968, 3, 30), 40, 2300.0);
			Instructor i4 = new Instructor("Arnout", "Veugelen", LocalDate.of(1988, 11, 22), 31, 2200.0);
			i2.printSalaryHistory();

			Course co1 = new Course("Java", 2, 300.0, false);
			co1.addInstructor(i1);
			co1.addInstructor(i2);
			Course co2 = new Course("Python", 3, 300.0, true);
			co2.addInstructor(i4);
			Course co3 = new Course("Cobol", 6, 300.0, false);
			co3.addInstructor(i3);
			co3.addInstructor(i2);

			Course[] courses = {co1, co2, co3};


			for (Course c : courses) {
				c.printInfo();
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}