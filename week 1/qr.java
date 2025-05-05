import java.util.Scanner;
public class qr{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter first value:");
	int n1=input.nextInt();
	System.out.print("Enter Second value:");
	int n2=input.nextInt();
	int quotient=n1/n2;
	double remainder=n1%n2;
	System.out.print("The quotient is :"+quotient+" and remainder is:"+remainder+"of two number"+n1+n2);
	}
}
	
	