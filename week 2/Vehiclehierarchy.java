class Vehicle{
	int capacity;
	double speed;
	String fueltype;
	
	public Vehicle(int capacity,double speed,String fueltype)
	{
		this.capacity=capacity;
		this.speed=speed;
		this.fueltype=fueltype;
	}
	
	public void displayinfo()
	{
		System.out.print("The vehicle details are:");
		
	}
	
}

class Car extends Vehicle{
	public Car(int capacity,double speed,String fueltype)
	{
		super(capacity,speed,fueltype);
	}
	
	public void displayinfo()
	{
		System.out.println("capacity:"+capacity+"\nspeed:"+speed+"\nfueltype:"+fueltype);
	}
}

class Truck extends Vehicle{
	public Truck(int capacity,double speed,String fueltype)
	{
		super(capacity,speed,fueltype);
	}
	
	public void displayinfo()
	{
		System.out.println("capacity:"+capacity+"\nspeed:"+speed+"\nfueltype:"+fueltype);
	}
}

class Motorcycle extends Vehicle{
	public Motorcycle(int capacity,double speed,String fueltype)
	{
		super(capacity,speed,fueltype);
	}
	
	public void displayinfo()
	{
		System.out.println("capacity:"+capacity+"\nspeed:"+speed+"\nfueltype:"+fueltype);
	}
}

class Vehiclehierarchy{
	public static void main(String[] args){
		Vehicle v1=new Car(6,87.9,"Petrol");
		Vehicle v2=new Truck(4,98.87,"Diesel");
		Vehicle v3=new Motorcycle(2,80.56,"Ev");
	
	
		v1.displayinfo();
		v2.displayinfo();
		v3.displayinfo();
	}
}




		
	