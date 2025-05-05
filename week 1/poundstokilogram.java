import java.util.Scanner;
public class poundstokilogram{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the weight in pounds");
	double pounds=input.nextDouble();
	double weight=pounds/2.2;
	System.out.print("the weight of the person in pounds is"+pounds+"and in kg is"+weight);
	}
}
	