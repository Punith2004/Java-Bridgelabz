import java.util.Scanner;
public class prime{
	public static boolean isPrime(int n){
	if(n<=2)
	{
	return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
		return false;
		}
	}
	return true;
	}
	
	

	
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int num=input.nextInt();
	if(isPrime(num))
	{
	System.out.print("The given number is prime");
	
	}
	else
	{
	System.out.print("The given number is not prime");
	}
	}
}
		
