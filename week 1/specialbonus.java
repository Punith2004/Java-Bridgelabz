import java.util.Scanner;
public class specialbonus{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the experience in company:");
	int experience=input.nextInt();
	System.out.print("Enter the salry you are getting:");
	int salary=input.nextInt();
	int bonus=salary*5/100;
	int finalsalary=salary+bonus;
	if(experience>5)
	{
	System.out.print("you are eligible for bonus and adding the bonus your salary is"+finalsalary);
	}
	else
	{
	System.out.print("You are not eligible for bonus your salary is:"+salary);
	}
	}
}