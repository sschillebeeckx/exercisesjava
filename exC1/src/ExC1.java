import java.util.ArrayList;
import java.util.Scanner;

public class ExC1 {
	
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

		printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired,instructors);

		
		double totalPrice = numberOfDays*pricePerDay;
		if (!(numberOfDays>3 && priorKnowledgeRequired)) {
			totalPrice*=1.21;
		}
		System.out.println("The total price is " + totalPrice + " euro.");
		
		String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}
		
		System.out.println("The price is " + label);
		
		
	}
	
	public static void printInfo(String title, int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired,ArrayList<String> instructors ){
	   System.out.println("The " + title + " course takes " + numberOfDays + " days and costs " + pricePerDay + " euros per day. \nPrior knowledge required: " + priorKnowledgeRequired );
	   System.out.println("There are " + instructors.size() + " instructors for this course.");
	}
	
}