import java.util.Scanner;
public class sumofnumbers{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the input:");
	int n=input.nextInt();
	int sumofnatural=(n*(n+1))/2;
	System.out.print("the sum of natural numbers is:"+sumofnatural);
	}
}