package Task5;

public class GImplementation {
	public static void main(String[] args){
		Garage g = new Garage();
		
		Vehicle v1 = new Car(1, "Toyota", "Yaris", 2007, "SL07 JPH", false, 250, "FF");
		Vehicle v2 = new Car(2, "Ford", "Focus", 2008, "TB08 DRM", false, 300, "FF");
		Vehicle v3 = new Bike(3, "Yamaha", "FZS", 2011, "FC11 TDI", 150, false);
		Vehicle v4 = new Van(4, "Mercedes", "Sprinter", 2010, "MM10 LOL", 400, false);
		Vehicle v5 = new Car(5, "Pagani", "Zonda", 2013, "VR13 FST", false, 50, "FR");
		Vehicle v6 = new Van(6, "Vauxhall", "Monavo", 2012, "BG12 ARS", 400, true);
		
		g.addVehicle(v1);
		g.addVehicle(v2);
		g.addVehicle(v3);
		g.addVehicle(v4);
		g.addVehicle(v5);
		g.addVehicle(v6);
		
		Vehicle v = g.get(4);
		v.print();
		System.out.print("\n");
		g.fixAll();
		g.removeByID(3);
		g.fixAll();
		g.removeByType("Car");
		g.fixAll();
		g.removeAll();
		g.fixAll();
	}
}
