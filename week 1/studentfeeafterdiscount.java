import java.util.Scanner;
public class studentfeeafterdiscount{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the fees of student:");
	int fees=input.nextInt();
	System.out.print("Enter the discount percent:");
	int discountpercent=input.nextInt();
	int discount=fees*discountpercent/100;
	int actualfees=fees-discount;
	System.out.print("the actual fees after discount is:"+actualfees);
	}
}