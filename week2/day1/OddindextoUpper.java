package week2.day1;

import java.util.Arrays;

public class OddindextoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "changeme";
		char[] chararr = text.toCharArray();
		Arrays.sort(chararr);
		
		for(int i =0; i<chararr.length;i++) {
			if(i%2 != 0) {
				chararr[i] = Character.toUpperCase(chararr[i]);
			}
		}
		String changedText = new String(chararr);
		System.out.println("Chenged Text"+changedText);
	}

}
