import java.util.Scanner;
public class grades{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the physics marks:");
	int physics=input.nextInt();
	System.out.print("Enter the chemistry marks:");
	int chemistry=input.nextInt();
	System.out.print("Enter the maths marks:");
	int maths=input.nextInt();
	int average=(physics+chemistry+maths)/3;
	if(average>=80)
	{
	System.out.print("A"+" average: "+average+" Level 4, above agency-normalized standards");
	}
	else if(average>=70)
	{
	System.out.print("B"+" average: "+average+" Level 3, at agency-normalized standards");
	}
	else if(average>=60)
	{
	System.out.print("C"+" average: "+average+" Level 2, below, but approaching agency-normalized standards");
	}
	else if(average>=50)
	{
	System.out.print("D"+" average: "+average+" Level 1, well below agency-normalized standards");
	}
	else if(average>=40)
	{
	System.out.print("E"+" average: "+average+" Level 1- , too below agency-normalized standards");
	}
	else if(average<=40)
	{
	System.out.print("R"+" average: "+average+" Remedial Standards");
	}
	}
}
	
	