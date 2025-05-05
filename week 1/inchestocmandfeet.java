import java.util.Scanner;
public class inchestocmandfeet{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the base value in inches:");
	double base=input.nextDouble();
	System.out.print("Enter the height value in inches:");
	double height=input.nextDouble();
	double heightincm=height*2.54;
	double baseincm=base*2.54;
	double baseinfeet=height/12.0;
	double heightinfeet=base/12.0;
	double areaoftriangleincm=0.5*baseincm*heightincm;
	double areaoftriangleinfeet=0.5*baseinfeet*heightinfeet;
	double areaoftriangle=0.5*base*height;
	System.out.print("Your height in cm is"+areaoftriangleincm+"\nwhile feet in"+areaoftriangleinfeet+"\nand inches is"+areaoftriangle);
	}
}
	
	