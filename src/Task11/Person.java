package Task11;

import java.util.ArrayList;

public class Person {
	int ID;
	String Name;
	String Gender;
	String signDate;
	ArrayList<Item> Borrowing = new ArrayList<Item>();
	ArrayList<String> returnDates = new ArrayList<String>();
	
	public Person(int id, String name, String gender, String signed){
		this.ID = id;
		this.Name = name;
		this.Gender = gender;
		this.signDate = signed;
	}
	
	public void updatePerson(String name, String gender, String signed){
		this.Name = name;
		this.Gender = gender;
		this.signDate = signed;
	}
	
	public void print(){
		System.out.println(ID);
		System.out.println(Name);
		System.out.println(Gender);
		System.out.println(signDate);
		System.out.print("\n");
	}
}
