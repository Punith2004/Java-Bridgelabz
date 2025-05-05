class car1{
	void carcompany()
	{
		System.out.print("The car company is Tesla");
	}
}

class car2 extends car1{
	void carcompany()
	{
		System.out.print("The car company is Bmw");
	}
}

class car3 extends car1{
	void carcompany()
	{
		System.out.print("The car company is mahindra");
	}
}

public class car{
	public static void main(String[] args)
	{
		car1 c1=new car1();
	
		c1.carcompany();
	}
}
	
	