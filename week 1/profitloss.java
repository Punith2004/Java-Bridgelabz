import java.util.Scanner;
public class profitloss{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the costprice:");
	int cp=input.nextInt();
	System.out.print("Enter the sellingprice:");
	int sp=input.nextInt();
	int profit=sp-cp;
	int profitpercentage=profit/cp*100;
	System.out.print("the cost price is:"+ cp+" and selling price is"+ sp+" the profit is"+ profit+" and profit percentage is"+ profitpercentage);
	}
}
	