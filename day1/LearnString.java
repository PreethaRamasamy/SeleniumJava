package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Preetha";
		String reversed = "";
		char[] chars = name.toCharArray();
		for(int i =name.length()-1; i>=0; i--) {
			System.out.println(chars[i]);
			reversed = reversed + chars[i];
		}
		System.out.println(reversed);
	}

}
