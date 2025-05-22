package week1.day2;

public class LearnSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =18;
		
		switch(age) {
		
		case 17:
			System.out.println("under age for voting");
			break;
		case 18:
			System.err.println("age for voting");
			break;
		default:
			System.out.println("No voting");
			break;
		}
	}
}
