import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int N=Integer.parseInt(userInput.nextLine());
		int comma=0; int X=0; int Y=0; int leftBottomX=0;int leftBottomY=0;int rightTopX=0;int rightTopY=0;
		String input="";
			input=userInput.nextLine();
			comma=input.indexOf(",");
			X=Integer.parseInt(input.substring(0, comma));
			Y=Integer.parseInt(input.substring(comma+1, input.length()));
			leftBottomX=X;
			leftBottomY=Y;
			rightTopX=X;
			rightTopY=Y;
		for (int i=0; i<N-1; i++) {
			input=userInput.nextLine();
			comma=input.indexOf(",");
			X=Integer.parseInt(input.substring(0, comma));
			Y=Integer.parseInt(input.substring(comma+1, input.length()));
			if (X<leftBottomX) {
				leftBottomX=X;
				
			}
			if (Y<leftBottomY) {
				leftBottomY=Y;
			}
			if (X>rightTopX) {
				rightTopX=X;
			}
			if (Y>rightTopY) {
				rightTopY=Y;
			}
		}
		System.out.println((leftBottomX-1)+","+(leftBottomY-1));
		System.out.println((rightTopX+1)+","+(rightTopY+1));
	}

}
