import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExD2 {

	public static void main (String[] args) {

		Path path = Paths.get("exD2\\src\\instructors.txt");
		try (BufferedReader br = Files.newBufferedReader(path)){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the course title.");
			String title = sc.next();

			boolean daysCorrect=false;
			int numberOfDays=0;
			String days="";
			System.out.println("Enter the number of days for this course.");
			while (!daysCorrect) {
				try {
					days= sc.next();
					numberOfDays = Integer.parseInt(days);
					daysCorrect=true;
				} catch (NumberFormatException nfe){
					System.out.println("Please enter a whole number. Try again.");
				}
			}

			boolean priceCorrect=false;
			System.out.println("What is the price per day?");
			double pricePerDay =0.0;
			String price="";
			while (!priceCorrect){
				try {
					price=sc.next();
					pricePerDay = Double.parseDouble(price);
					priceCorrect=true;
				} catch (NumberFormatException nfe){
					System.out.println("Please enter a correct number. Try again, you know the drill...");
				}
			}

			boolean priorKnowledgeRequired = false;
			boolean knowledgeRequiredCorrect=false;
			System.out.println("Is prior knowledge required? (y/n)");
			while (!knowledgeRequiredCorrect) {
				try {
					String value = sc.next();
					if (value.equalsIgnoreCase("y")) {
						priorKnowledgeRequired = true;
						knowledgeRequiredCorrect=true;
					} else if (value.equalsIgnoreCase("n")) {
						priorKnowledgeRequired = false;
						knowledgeRequiredCorrect=true;
					} else {
						throw new InputMismatchException();
					}
				} catch (InputMismatchException ime) {
					System.out.println("Please enter y or n. Try again, you know the drill...");
				}
			}

			sc.close();

			List<String> instructors= new ArrayList<>();
			String name = null;
			while ((name=br.readLine())!= null){
				instructors.add(name);
			}


			//double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );

			printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired, instructors );


		} catch (IOException ioe){
			System.out.println("File not found: " +ioe.getMessage());
		}
	}


	public static  void printInfo(String title, int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired, List<String> instructors) throws IOException {
		BufferedWriter bw = Files.newBufferedWriter(Paths.get("exD2\\src\\courseinfo.txt"));
		double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
		bw.write("The " + title + " course takes " + numberOfDays + " days and costs " + pricePerDay + " per day. \nPrior knowledge required: " + priorKnowledgeRequired +".\n"); String label;
		bw.write("There are " + instructors.size() + " instructors for this course:\n");
		for(String instructor: instructors) {
			bw.write(instructor+"\n");
		}

		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}

		bw.write("The total price is "+ totalPrice + ". That is " + label + ".");

		bw.close();
		System.out.println("info written to courseinfo.txt");

	}

	public static double calculatePrice(int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
		double totalPrice = numberOfDays * pricePerDay;
		if (!(numberOfDays > 3 && priorKnowledgeRequired)) {
			totalPrice *= 1.21;
		}
		return totalPrice;
	}

}