package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fibNumber = 8;
		int number1=0;
		int number2=1;
		
		for(int i=0; i<fibNumber; i++) {
			
			System.out.println("Fibobacci Series"+number1 +"\n");
			int nextNumber = number1 + number2;
			number1 = number2;
			number2 = nextNumber;
			
		}
	}

}
