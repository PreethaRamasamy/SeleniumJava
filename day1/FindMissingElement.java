package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(input);
		
		for(int i= input[0]; i<=input[input.length - 1];i++) {
			if (i != input[i - input[0]]) {
				 System.out.println("Missing number is: " + i);
			        break;
			}
		}
	}

}
