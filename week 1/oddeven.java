import java.util.Scanner;
public class oddeven{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=input.nextInt();
	if(n%2==0)
	{
	System.out.print("even");
	}
	else
	{
	System.out.print("odd");
	}
	}
}