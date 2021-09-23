import java.io.IOException;

public class ExF1 {

	public static void main(String[] args) {

		Course co1 = new Course("Java", 2, 300.0, false);
		co1.addInstructor("Sandy");
		co1.addInstructor("Gie");
		Course co2 = new Course("Python", 3, 300.0, true);
		co2.addInstructor("Arnout");
		Course co3 = new Course("Cobol", 6, 300.0, false);
		co3.addInstructor("Peter");
		co3.addInstructor("Gie");
		
		Course[] courses = { co1, co2, co3 };

		try {
			for (Course c : courses) {
				System.out.println(c.getTitle() + " costs " + c.calculatePrice());
				c.printInfo();
			}
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
