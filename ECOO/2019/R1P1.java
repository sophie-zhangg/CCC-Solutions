// "Free Shirts"

import java.util.Scanner;

public class R1P1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		for (int i=0; i<10;i++) {
			String str=userInput.nextLine();
			String strWEvents=userInput.nextLine();
			System.out.println(shirt(str, strWEvents));
		}
		userInput.close();
	}
	
	private static int shirt(String input1, String input2) {
		int [] dataset = intoArray(input1, 3);
		int [] daysWEvents = intoArray(input2, dataset[1]);
		int shirtsLeft=dataset[0];
		int totalShirts=dataset[0];
		int laundry=0;
		for (int i=0; i<dataset[2]; i++) {
			if (shirtsLeft==0) { // then do "laundry"
				laundry++;
				shirtsLeft=totalShirts;
			}
			shirtsLeft--; // one shirt worn
			for (int elem:daysWEvents) { 
				if (elem==i+1) { //if the day equals the event day, then give extra shirt
					totalShirts++;
					shirtsLeft++;
				}
			}
		}
		return laundry;
	}  
	
	private static int[] intoArray(String input, int numOfElem) {
		int [] array = new int [numOfElem];
		int index=0;
		int num=0;
		for (int i=0; i<input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				array[index]=Integer.parseInt(input.substring(num,i));
				index++;
				num=i+1;
	        }
		}
		array[index]=Integer.parseInt(input.substring(num,input.length()));
		return array;
	}
	

}
