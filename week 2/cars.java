class car{
	public void carname(){
		System.out.print("\nthe carname is tesla");
	}
}

class carcolour extends car{
	public void color(){
		System.out.print("the car colour is grey");
	}
}
public class cars{
	public static void main(String[] args){
	carcolour s=new carcolour();
	s.color();
	s.carname();
	}
}