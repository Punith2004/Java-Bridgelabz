import java.util.Scanner;
public class harshadnumber{
	public static boolean isharshad(int n){
		int temp=n;
		int sum=0;
		while(temp>0){
		sum+=temp%10;
		temp/=10;
		}
	return(n%sum==0);
	}
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=input.nextInt();
	if(isharshad(n))
	{
	System.out.print("it is harshad");
	}
	else
	{
	System.out.print("it is not harshadnumber");
	}
	}
}