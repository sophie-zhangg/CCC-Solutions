import java.util.Scanner;

public class R1P3.java {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		// 3 ints; temp string array and int array
		String[] strLine = new String [3];
		int[] line = new int [3];
		//string input temp to split
		String input="";
		//set jump height to 0
		int J=0;
		for (int i=0; i<10; i++) {
			input=userInput.nextLine();
			strLine = input.split(" ");
			for (int count=0; count<strLine.length; count++) {
				line[count]=Integer.parseInt(strLine[count]);
			}
			//set jump height to first int
			J=line[0];
			// create game array
			String game[] = new String[line[2]];
			for (int count=0; count<line[2]; count++) {
				game[count]=userInput.nextLine();		 
			}
			System.out.println(theGame(game,J,line[1],line[2]));
			game = null;
		}
		userInput.close();
	}
	
	private static String theGame(String listGame[], int jumpHeight, int width, int height) {
		//remove bottom hashes
		height--;
		//create 2D array od simulator
		char[][] game = new char[height][width];
		for (int i=0; i<listGame.length-1; i++) {
			for (int n=0; n < listGame[i].length(); n++) {
				game[i][n]=listGame[i].charAt(n);
			}
		}
		// for the length of the bottom row of the game, look for the starting point
		for(int i=0; i < game[height-1].length; i++) {
			if (game[height-1][i]=='L') {
				//when found, call search for path
				return searchForPath(game, jumpHeight, height, i);
			}
		}
		// just in case failed
		return "CLEAR";
	}
	
	private static String searchForPath(char[][] arr, int jumpHeight, int height, int start) {
		// reduce height by one so that it can be index
		height--;
		char c=' ';
		int index=0;
		// look through length of simulator starting from the 'L'
		for(int i = start + 1; i < arr[0].length; i++) {
			//look at bottom row
			c=arr[height][i];
			// if it is an '@' symbol
			if (c == '@') { 
				index = 0;
				// while char at index is still '@'and blocks on the left and right of the '@' are not @s
				while (c == '@') {
					if (arr[height-index][i-1]=='@' || arr[height-index][i+1]=='@') {
						return Integer.toString(i+1);
					}
					// increment index
					index++;
					// if height greater than or equal to index and index is less than or equal to jump height, move inspected @ upwards
					if (index <= height && index <= jumpHeight) {
						c = arr[height-index][i];
					}
					else {
						return Integer.toString(i+1);
					}
				}
				if (arr[height-index][i-1]=='@' || arr[height-index][i+1]=='@') {
					return Integer.toString(i+1);
				}
			}
			else if (c=='G') { 
				return "CLEAR";
			}
		}
		return "CLEAR";
	}

}
