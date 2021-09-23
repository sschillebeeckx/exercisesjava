import java.io.IOException;
import java.time.LocalDate;

public class ExF3 {
	
	public static void main (String[] args) {
	
     try {
		 LocalDate birthDate= LocalDate.of(1978,4,10);
		Instructor i1 = new Instructor("Sandy","Schillebeeckx",birthDate,23,2000.0);
		i1.printSalaryHistory();


		
	 } catch (IOException ioe){
			System.out.println(ioe.getMessage());
	 } 
	 
	}
	
	
}