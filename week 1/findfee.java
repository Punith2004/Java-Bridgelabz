import java.util.Scanner;
public class findfee{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter fees of student:");
	int fees=input.nextInt();
	System.out.print("Enter discount of student:");
	int discountpercent=input.nextInt();
	int discount=fees*discountpercent/100;
	int afterdiscount=fees-discount;
	System.out.print("The discount amount is:"+discount+" and final discount fees is:"+afterdiscount);
	}
}
	
	
	