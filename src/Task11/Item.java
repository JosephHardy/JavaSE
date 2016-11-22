package Task11;

import java.util.Date;

public abstract class Item {
	int ID;
	String Name;
	String Published;
	boolean Available;
	Date out;
	Date in;
	String borrowedBy;
	
	public Item(){}	
	
	public Item(int id, String name, String published){
		this.ID = id;
		this.Name = name;
		this.Published = published;
		this.Available = true;
	}
	
	public abstract void updateItem(String name, String published);

	public abstract void print();
}
