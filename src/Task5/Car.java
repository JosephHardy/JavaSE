package Task5;

public class Car extends Vehicle {
	boolean Convertible;
	int BootSpace;
	String Layout;
	
	public Car(){}
	
	public Car(int id, String man, String mod, int y, String reg, boolean con, int boot, String lay){
		super(id, man, mod, y, reg);
		this.Type = "Car";
		this.Convertible = con;
		this.BootSpace = boot;
		this.Layout = lay;
	}
	
	@Override
	public void print(){
		System.out.println("ID: " + this.ID);
		System.out.println("Manufacturer: " + this.Manufacturer);
		System.out.println("Model: " + this.Model);
		System.out.println("Year: " + this.Year);
		System.out.println("Registration: " + this.Registration);
		if (this.Convertible == true){
			System.out.println("Convertible: Yes");
		} else {
			System.out.println("Convertible: No");
		}
		System.out.println("Boot Space: " + this.BootSpace + "l");
		System.out.println("Layout: " + this.Layout);
	}
}
