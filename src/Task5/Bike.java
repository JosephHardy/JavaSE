package Task5;

public class Bike extends Vehicle{
	int Engine;
	boolean Sidecar;
	
	public Bike(){}
	
	public Bike(int id, String man, String mod, int y, String reg, int eng, boolean side){
		super(id, man, mod, y, reg);
		this.Type = "Bike";
		this.Engine = eng;
		this.Sidecar = side;
	}
	
	@Override
	public void print(){
		System.out.println("ID: " + this.ID);
		System.out.println("Manufacturer: " + this.Manufacturer);
		System.out.println("Model: " + this.Model);
		System.out.println("Year: " + this.Year);
		System.out.println("Registration: " + this.Registration);
		System.out.println("Engine: " + this.Engine + "cc");
		if (this.Sidecar == true){
			System.out.println("Sidecar: Yes");
		} else {
			System.out.println("Sidecar: No");
		}
	}
}
