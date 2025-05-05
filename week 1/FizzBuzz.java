import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=input.nextInt();
	if(n<=0)
	{
	System.out.print("Enter the positive number:");
	return;
	}
	for(int i=1;i<=n;i++)
	{
	if(i%3==0)
	{
	System.out.print("Fizz ");
	}
	else if(i%5==0)
	{
	System.out.print("Buzz ");
	}
	else if(i%3==0&&i%5==0)
	{
	System.out.print("FizzBuzz ");
	}
	else
	{
	System.out.print(i+" ");
	}
	}
	
	}
}