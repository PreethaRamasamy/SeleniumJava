package week1.day2.assignments;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber = 13;  
		boolean flag = false ;
		// Check from 2 to n-1
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
            	flag = true;
            } 
        }
        if(flag == true) {
        	System.out.println("The given number is not  Prime");
        }else {
        	System.out.println("The given number is prime");
        }
	}
}
