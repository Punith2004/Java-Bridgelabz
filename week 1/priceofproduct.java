import java.util.Scanner;
public class priceofproduct{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the quantity of product:");
	int quantity=input.nextInt();
	System.out.print("Enter the cost of product:");
	int cost=input.nextInt();
	int finalprice=quantity*cost;
	System.out.print(finalprice);
	}
}