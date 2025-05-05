import java.util.Scanner;
public class simpleintrest{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Principal:");
	int principal=input.nextInt();
	System.out.println("Enter the rate of intrest:");
	int intrest=input.nextInt();
	int time=60*2;
	int SI=(principal*intrest*time)/100;
	System.out.print(SI);
	}
}
	
	