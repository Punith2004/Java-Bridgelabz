import java.util.Scanner;
public class caluclateprofit{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the cost price:");
	int cp=input.nextInt();
	System.out.print("Enter the selling  price:");
	int sp=input.nextInt();
	int profit=sp-cp;
	int profitpercentage=profit/cp*100;
	System.out.print("The profit of the product is"+profit+"and percentage of profit is"+profitpercentage);
	}
}
	