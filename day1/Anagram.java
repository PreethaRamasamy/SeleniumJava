package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length() == text2.length()) {
			
			char chararr1[] = text1.toCharArray();
			char chararr2[] = text2.toCharArray();
			
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			
//			for(int i=0;i<chararr1.length;i++) {
//				for(int j=0;j<chararr2.length;j++) {
//					chararr1[i] = chararr2[j];
//				}
//			}

			if(Arrays.equals(chararr1, chararr2) ) {
				
				System.out.println("The given string is Anagram");				
			}else {
				System.out.println("The given string is not Anagram");
			}
		}else{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	}

}
