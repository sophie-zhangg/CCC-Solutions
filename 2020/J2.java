import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int P=userInput.nextInt();
		int N=userInput.nextInt();
		int R=userInput.nextInt();
		int totalNumPeople=N;
		int days=0;
		int lastDayNum=N;
		while (P>=totalNumPeople) {
			lastDayNum=lastDayNum*R;
			totalNumPeople=totalNumPeople+(lastDayNum);
			days++;
		}
		System.out.println(days);
	}

}
