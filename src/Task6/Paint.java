package Task6;

public class Paint {
	String Name;
	double Price;
	int Volume;
	int Coverage;
	int MaxCov;
	
	public Paint(String name, double price, int volume, int coverage){
		this.Name = name;
		this.Price = price;
		this.Volume = volume;
		this.Coverage = coverage;
		this.MaxCov = coverage * volume;
	}
}
