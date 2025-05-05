import java.util.Scanner;
public class Rectangle{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the length:");
	int length=input.nextInt();
	System.out.println("Enter the Width:");
	int width=input.nextInt();
	int perimeter=2*(length+width);
	System.out.print(perimeter);
	}
}