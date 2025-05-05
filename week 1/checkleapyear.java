import java.util.Scanner;
public class checkleapyear{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the year:");
	int year=input.nextInt();
	if(year%400==0)
	{
	System.out.print("The year you provided was leap year:"+year);
	}
	else
	{
	System.out.print("The year you provided was not leap year:"+year);
	}
	}
}