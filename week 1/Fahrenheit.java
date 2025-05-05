import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter celsius values:");
	int celsius=input.nextInt();
	int Far=(celsius*9/5)+32;
	System.out.print(Far);
	}
}
