import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExC2 {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course title.");
		String title = sc.next();

		System.out.println("Enter the number of days for this course.");
		int numberOfDays = sc.nextInt();

		System.out.println("What is the price per day?");
		double pricePerDay = sc.nextDouble();

		System.out.println("Is prior knowledge required? (y/n)");
		String value = sc.next();
		boolean priorKnowledgeRequired = true;
		if (value.equalsIgnoreCase("n")){
			priorKnowledgeRequired=false;
		}

		sc.close();

		ArrayList<String> instructors= new ArrayList<>();
		instructors.add("Sandy");
		instructors.add("Gie");
		
		
		//double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );

		printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired,instructors);
				
	}
	
	public static void printInfo(String title, int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired, List<String> instructors){
	   double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
	   System.out.println("The " + title + " course takes " + numberOfDays + " days and costs " + pricePerDay + " per day. \nPrior knowledge required: " + priorKnowledgeRequired );
	   System.out.println("There are " + instructors.size() + " instructors for this course.");
	   String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}
		
		System.out.println("The total price is "+ totalPrice + ". That is " + label + ".");
	}
	
	public static double calculatePrice(int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired ){
		double totalPrice = numberOfDays*pricePerDay;
		if (!(numberOfDays>3 && priorKnowledgeRequired)) {
			totalPrice*=1.21;
		}
		return totalPrice;
	}
	
}