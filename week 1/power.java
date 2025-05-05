import java.util.Scanner;
public class power{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the base number:");
	double base=input.nextDouble();
	System.out.print("Enter the exponent value:");
	double exponent=input.nextDouble();
	double p=Math.pow(base*exponent);
	System.out.print(p);
	}
}