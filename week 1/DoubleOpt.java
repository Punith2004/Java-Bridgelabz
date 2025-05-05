import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a value:");
	double a=input.nextDouble();
	System.out.print("Enter b value:");
	double b=input.nextDouble();
	System.out.print("Enter c value:");
	double c=input.nextDouble();
	double n1=a+b*c;
	double n2=a*b+c;
	double n3=c+a/b;
	double n4=a%b+c;
	System.out.print("n1:"+n1+"\nn2:"+n2+"\nn3:"+n3+"\nn4:"+n4);
	}
}