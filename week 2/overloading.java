public class overloading{
	public int add(int a,int b){
		return a+b;
	}


	public double add(double a,double b){
	return a+b;
	}



	public static void main(String[] args){
		overloading s=new overloading();
		System.out.print("By adding two number we get:"+s.add(5,4));
		System.out.print("\nBy adding two number we get:"+s.add(5.5,4.4));
	}
}
		