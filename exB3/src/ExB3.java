public class ExB3 {
	
	public static void main (String[] args) {
		
		int[] numbers = {3,5,6,8,10};
		
		double total = 0;

		for (int i=0; i<numbers.length; i++){
			total= total + numbers[i];
		}
		for (int val : numbers){
			total+=val;
		}
		
        double average = total/numbers.length;
		System.out.println("The average is: " + average);
			

		
		
		
		
	}
}