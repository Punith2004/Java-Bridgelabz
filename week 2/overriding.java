 class Birds{
	public void bird(){
		System.out.print("The bird voice is sweet");
	}
 }
class birdscolor extends Birds{
	public void bird(){
		System.out.print("The bird color is green");
	}
}

public class overriding{
	public static void main(String[] args){
		birdscolor s=new birdscolor();
		s.bird();
	}
}
	