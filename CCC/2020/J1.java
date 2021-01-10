import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int S=userInput.nextInt();
		int M=userInput.nextInt();
		int L=userInput.nextInt();
		int happyScore=S+(M*2)+(L*3);
		if (happyScore>=10) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
	}
}
