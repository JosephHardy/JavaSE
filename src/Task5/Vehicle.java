package Task5;

public abstract class Vehicle {
	int ID;
	String Manufacturer;
	String Model;
	int Year;
	String Registration;
	String Type;			// Workaround for delete by type
	
	public Vehicle(){}
	
	public Vehicle(int id, String man, String mod, int y, String reg){
		this.ID = id;
		this.Manufacturer = man;
		this.Model = mod;
		this.Year = y;
		this.Registration = reg;
	}
	
	public abstract void print();
}