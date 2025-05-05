class Bike{
	public void bikename(){
		System.out.print("The bike name is activa\n");
	}
}

class bikemileage extends Bike{
	public void mileage(){
		 System.out.print("the bike give mileage of 20km for 1 liter\n");
	}
}

class bikecolor extends bikemileage{
	public void color(){
		System.out.print("the bike color is blue\n");
	}
}

public class Bikes{
	public static void main(String[] args){
		bikecolor s=new bikecolor();
		s.bikename();
		s.mileage();
		s.color();
	}
}