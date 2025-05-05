import java.util.Scanner;
public class Choclates{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter number of children");
	int children=input.nextInt();
	System.out.print("Enter number of choclates");
	int chocl=input.nextInt();
	int  eachchoclgetbychild=chocl/children;
	int remaining=chocl%children;
	System.out.print("the choclate get by each children is"+eachchoclgetbychild+"and remaining choclates are"+remaining);
	}
}
	
	