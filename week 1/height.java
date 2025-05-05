import java.util.Scanner;
public class height{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the height of amar:");
	double height1=input.nextDouble();
	System.out.print("Enter the height of akbar:");
	double height2=input.nextDouble();
	System.out.print("Enter the height of antony:");
	double height3=input.nextDouble();
	if(height1>height2&&height1>height3)
	{
	System.out.print("Amar is tallest ammong all");
	}
	if(height2>height1&&height2>height3)
	{
	System.out.print("Akbar is tallest ammong all");
	}
	if(height3>height2&&height3>height1)
	{
	System.out.print("Antony is tallest ammong all");
	}
	}
}
	
	