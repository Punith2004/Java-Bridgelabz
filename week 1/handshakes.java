import java.util.Scanner;
public class handshakes{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter number of students:");
	int n=input.nextInt();
	int possiblehandshakes=(n*(n-1))/2;
	System.out.print("The number of possible handshakes are:"+possiblehandshakes);
	}
}