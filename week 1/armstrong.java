import java.util.Scanner;
public class armstrong{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int number=input.nextInt();
	int sum=0;
	int digit=0;
	int originalnumber=number;
	
	while(number!=0){
	digit=number%10;
	sum=sum+(digit*digit*digit);
	number=number/10;
	}
	
	if(sum==originalnumber)
	{
	System.out.print("Armstrong");
	}
	else
	{
	System.out.print("not armstrong");
	}
	}
}
	