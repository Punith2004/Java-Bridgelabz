import java.util.Scanner;
public class centimeterstofeetandinches{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the height in cm:");
	double centimeters=input.nextDouble();
	double centimeterstofeet=centimeters/12;
	double centimeterstoinches=centimeters/2.54;
	System.out.print("Your height in cm is:"+centimeters+"while in feet is:"+centimeterstofeet+"and inches is:"+centimeterstoinches);
	}
}