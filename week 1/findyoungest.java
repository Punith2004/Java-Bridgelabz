import java.util.Scanner;
public class findyoungest{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter age of amar:");
	int age1=input.nextInt();
	System.out.print("Enter age of akbar:");
	int age2=input.nextInt();
	System.out.print("Enter age of antony:");
	int age3=input.nextInt();
	if(age1<age2&&age1<age3)
	{
	System.out.print("Amar is smallest among all");
	}
	if(age2<age1&&age2<age3)
	{
	System.out.print("Akbar is smallest among all");
	}
	if(age3<age1&&age3<age2)
	{
	System.out.print("Antony is smallest among all");
	}
	}
}
	
	
	