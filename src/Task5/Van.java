package Task5;

public class Van extends Vehicle{
	int Capacity;
	boolean Refrigeration;
	
	public Van(){}
	
	public Van(int id, String man, String mod, int y, String reg, int cap, boolean ref){
		super(id, man, mod, y, reg);
		this.Type = "Van";
		this.Capacity = cap;
		this.Refrigeration = ref;
	}
	
	@Override
	public void print(){
		System.out.println("ID: " + this.ID);
		System.out.println("Manufacturer: " + this.Manufacturer);
		System.out.println("Model: " + this.Model);
		System.out.println("Year: " + this.Year);
		System.out.println("Registration: " + this.Registration);
		System.out.println("Capacity: " + this.Capacity + "m^3");
		if (this.Refrigeration == true){
			System.out.println("Refrigeration: Yes");
		} else {
			System.out.println("Refrigeration: No");
		}
	}
}
