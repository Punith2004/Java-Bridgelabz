import java.util.Scanner;
public class AbundantNumber{
	public static boolean isAnbudant(int n){
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
	}
	return sum>n;
   }
	
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the input:");
	int n=input.nextInt();
	if(isAnbudant(n))
	{
		System.out.print("it is anbudant number");
	}
	else
	{
	System.out.print("not anbudant number");
	}
	}
}
	