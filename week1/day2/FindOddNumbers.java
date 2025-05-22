package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 179264;
		
		for(int i=1;i<=value;i++) {
			if(i%2==1) {
				System.out.println("Number :"+ i + "Its an Odd number");
			}
		}
		
		if(844535674%2==0) {
			System.out.println("Its an Even number");
		}else {
			System.out.println("Its an Odd number");
		}
	}

}
