import java.util.Scanner;
public class Bodymassindex{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the height:");
	double h=input.nextDouble();
	double heightinmeters=h*0.01;
	System.out.print("Enter the weight:");
	double w=input.nextDouble();
	double bmi=w/(heightinmeters*heightinmeters);
	if(bmi>=18.4)
	{
	System.out.print("status: "+"underweight");
	}
	else if(bmi<=18.5)
	{
	System.out.print("status: "+"Normal");
	}
	else if(bmi<=25.0)
	{
	System.out.print("status: "+"overweight");
	}
	else if(bmi>=40)
	{
	System.out.print("status:"+"obese");
	}
	}
}
	
	
	
	