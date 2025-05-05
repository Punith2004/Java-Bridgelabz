import java.util.Scanner;
public class combinations{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter pepole present in function:");
	int students=input.nextInt();
	int n=students;
	int possiblehandshakes=(n*(n-1))/2;
	System.out.print("The number of possible handshakes are:"+possiblehandshakes);
	}
}