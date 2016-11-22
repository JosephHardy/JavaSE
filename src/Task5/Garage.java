package Task5;
import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	public ArrayList<Vehicle> list;
	
	public Garage(){
		list = new ArrayList<Vehicle>();			
	}

	public void addVehicle(Vehicle v) {
		list.add(v);
	}
	
	public Vehicle get(int id){
		int i = 0;
		boolean found = false;
		for (Vehicle v: list){
			if (v.ID == id){
				i = list.indexOf(v);
				found = true;
				break;
			}
		}
		if (found == false){
			System.out.println("ID not found!");
		}
		return list.get(i);
	}
	
	public void removeByID(int id){
		for (Vehicle v: list){
			if (v.ID == id){
				list.remove(v);
				break;
			}
		}
	}
	
	public void removeByType(String type){
		
		// Iterate through list of vehicles
		Iterator it = list.iterator(); 
		while(it.hasNext()){
		    Vehicle v = (Vehicle) it.next();
		    
		    // Remove if type matches
		    if(v.Type == type){
		        it.remove();
		    }
		}	
	}
	
	public void removeAll(){
		list.clear();
	}
	
	public void fix(Vehicle v){
		
		String T = v.Type;
		int P = 0;
		switch(T){
		
		case "Car":
			Car c = (Car) v;
			P = 1000;
			if (c.Convertible == true){
				P += 1000;
			}
			if (c.BootSpace >= 300){
				P += 500;
			}
			if (c.Layout == "FR"){
				P += 750;
			}
			else if (c.Layout == "4WD"){
				P += 1000;
			}
			break;
		case "Bike":
			Bike b = (Bike) v;
			P = 750;
			if (b.Engine >= 200){
				P += 500;
			} else {
				P += 250;
			}
			if (b.Sidecar == true){
				P += 500;
			}
			break;
		case "Van":
			Van a = (Van) v;
			P = 1500;
			if (a.Capacity >= 500){
				P += 500;
			} else {
				P += 250;
			}
			if (a.Refrigeration == true){
				P += 750;
			}
			break;
		}
		
		System.out.println("Repair Price: £" + P);
	}
	
	public void fixAll(){
		if (list.size() == 0){
			System.out.print("Garage is empty!");
		} else {
			for (Vehicle v: list){
				System.out.print("ID: " + v.ID + "\t");
				fix(v);
			}
		}
		System.out.print("\n");
	}
}
