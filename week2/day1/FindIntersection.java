package week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1[] = {3,2,11,4,6,7};
		int number2[] = {1,2,8,4,9,7};
		
		for(int i=0; i< number1.length;i++) {
			for(int j=0; j<number2.length;j++) {
				if(number1[i] == number2[j]) {
					System.out.println("Matching number"+ number1[i]);
				}else {
					//System.out.println("No matches");
				}
			}
		}
	}

}
