import java.util.Scanner;
public class income{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the income of person");
	int income=input.nextInt();
	int bonus=income*20/100;
	int totalmoney=income+bonus;
	System.out.print("The salary of the person is"+income+"and bonus amount is"+bonus+"and adding bonus with income it is"+totalmoney);
	}
}