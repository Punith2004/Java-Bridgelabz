import java.util.Scanner;
public class Factorial{
	public static int factorial(int num){
		if(num==0||num==1)
		{
		return 1;
		}
		else
		{
		return num*factorial(num-1);
		}
	}
	
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=input.nextInt();
	System.out.print("the factorial of number is:"+factorial(n));
	}
}
	
	