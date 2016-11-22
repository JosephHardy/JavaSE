package Task6;

import java.util.ArrayList;

public class PaintRoom {
	public ArrayList<Paint> range;
	public ArrayList<Double> prices;
	public ArrayList<Integer> excess;
	
	public PaintRoom(){
		range = new ArrayList<Paint>();			
	}
	
	public void addPaint(Paint p){
		range.add(p);
	}
	
	public Paint getPaint(int i){
		Paint p = range.get(i);
		return p;
	}
	
	public String getPaintName(int i){
		Paint p = getPaint(i);
		return p.Name;
	}
	
	public int CansNeeded(int Size, Paint p){
		int Cans = 0;
		int Available = 0;
		
		// keep buying cans until we can cover the room
		do {
			Cans++;
			Available = p.MaxCov * Cans;
		}
		while (Available < Size);
		return Cans;
	}
	
	public String bestPrice(int size){
		// Create list of paint costs
		prices = new ArrayList<Double>();
		Paint p;
		int cans = 0;
		double Cost;
		
		// Calculate costs of each paint and add it to list of costs
		for (int i = 0; i < range.size(); i++){
			p = getPaint(i);
			cans = CansNeeded(size, p);
			Cost = cans * p.Price;
			prices.add(Cost);
		}
		int Best = 0;
		
		// Find lowest cost and match it to its paint name
		for (int i = 1; i < prices.size(); i++){
			if (prices.get(i) < prices.get(Best)){
				Best = i;
			}
		}
		return getPaintName(Best);
	}
	
	public String leastWaste(int size){
		// Create list of paint excesses
		excess = new ArrayList<Integer>();
		
		Paint p;
		int cans = 0;
		int Waste = 0;
		
		// Calculate excesses of each paint and add it to list of excesses
		for (int i = 0; i < range.size(); i++){
			p = getPaint(i);
			cans = CansNeeded(size, p);
			Waste = cans * p.Coverage - size;
			excess.add(Waste);
		}
		int Best = 0;
		
		// Find lowest excess and match it to its paint name
		for (int i = 1; i < prices.size(); i++){
			if (prices.get(i) < prices.get(Best)){
				Best = i;
			}
		}
		return getPaintName(Best);
	}
}
