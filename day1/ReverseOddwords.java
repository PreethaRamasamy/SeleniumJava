package week2.day1;

public class ReverseOddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputText = "I am a software tester";
		String[] textArr = inputText.split(" ");		
		String result ="";
		
		for(int i=0;i<textArr.length;i++) {
			if(i%2 !=0){	
				String reversed= "";
				char[] chars = textArr[i].toCharArray();
		       
		        for (int j = chars.length - 1; j >= 0; j--) {
		        	reversed += chars[j];
		        }
		        result = result +reversed;
			}else {
                result += textArr[i];
            }	
			if (i < textArr.length - 1) {
	            result += " ";
	        }
		}
		
		System.out.println(result);
	}

}