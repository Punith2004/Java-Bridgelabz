class Animal{
	public void eat(){
	System.out.print("The animal can eat");
	}
}
	
class Dog extends Animal{
	public void bark(){
	System.out.print("The animal is Dog\n");
	}
}

class bark extends Animal{
	public void dogname(){
		System.out.print("the dog name is snuppy");
	}
}

public class Animals{
	public static void main(String[] args){
	Dog s=new Dog();
	s.bark();
	s.eat();
	s.dogname();
	}
}
	

	