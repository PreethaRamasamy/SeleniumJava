package week2.day1;

public class DeuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputText = "We learn Java basics as part of java sessions in java week1";
		int count =0;
		String textarr[] = inputText.split(" ");
		String resultText = "";
		
		for(int i=0;i<textarr.length;i++) {
			for(int j=i+1; j<textarr.length;j++) {
				if(textarr[i].equalsIgnoreCase(textarr[j])) {
					textarr[j] = "";
					count++;
					System.out.println(count);					
				}
			}
		}
		
		if(count > 0) {
			for(int k=0; k<textarr.length;k++) {
				System.out.println(textarr[k]);	
				resultText = resultText +" "+ textarr[k];
				
			}
		}
		
		System.out.println("Result String :"+resultText);
	}

}
