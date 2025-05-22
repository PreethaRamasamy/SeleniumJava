package week1.day2.assignments;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber = 12321;
		int outputNumber = 0;
		
		for(int i=inputNumber; i >0; i=i/10) {
			
			int reminder = i % 10;
			outputNumber = ( outputNumber * 10 ) +reminder;			
		}
		
		System.out.println("Input Number" + inputNumber);
		System.out.println("Output Number" + outputNumber);
		
		if(inputNumber == outputNumber) {
			System.out.println("The given number is Palinrome");
		}else{
			System.out.println("The given number is not palindrome");
		}
		
	}

}
