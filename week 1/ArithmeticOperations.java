import java.util.Scanner;
public class ArithmeticOperations{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a value:");
	double a=input.nextDouble();
	System.out.print("Enter b value:");
	double b=input.nextDouble();
	double n1=a+b;
	double n2=a-b;
	double n3=a*b;
	double n4=a/b;
	System.out.print("The addition,subtraction,multipication and divison value of 2 numbers"+a+"and"+b+"is"+n1+","+n2+","+n3+"and"+n4);
	}
}
	
	