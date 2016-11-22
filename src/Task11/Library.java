package Task11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Library {
	public ArrayList<Item> items;		// Item list
	public ArrayList<Person> people;	// Person list
	
	// Default constructor
	public Library(){
		items = new ArrayList<Item>();
		people = new ArrayList<Person>();
	}
	
	public void addItem(Item I) {
		items.add(I);
	}
	
	public void registerPerson(Person P) {
		people.add(P);
	}
	
	// Methods to find Items and people using ID numbers
	public Item findItemByID(int id){
		Item x = null;
		for (Item I: items){
			if (I.ID == id){
				x = I;
				break;
			}
		}
		return x;
	}
	
	public Person findPersonByID(int id){
		Person x = null;
		for (Person P: people){
			if (P.ID == id){
				x = P;
				break;
			}
		}
		return x;
	}
	
	public void removeItemByID(int id){
		Item I = findItemByID(id);
		items.remove(I);
	}
	
	public void removePersonByID(int id){
		Person P = findPersonByID(id);
		people.remove(P);
	}
	
	public void printItems(){
		for (Item I: items){
			I.print();
		}
	}
	
	public void printPeople(){
		for (Person P: people){
			P.print();
		}
	}
	
	// Generic Item update, never used
	public void updateItemByID(int id, String name, String published){
		Item I = findItemByID(id);
		I.updateItem(name, published);
	}
	
	// Specific item updates
	public void updateItemByID(int id, String name, String published, String author, String genre, boolean hardback){
		Book B;
		Item I = findItemByID(id);
		if (I instanceof Book){
			B = (Book) I;
			B.updateItem(name, published, author, genre, hardback);
		}
	}
	
	public void updateItemByID(int id, String name, String published, String style, int issue){
		Newspaper N;
		Item I = findItemByID(id);
		if (I instanceof Newspaper){
			N = (Newspaper) I;
			N.updateItem(name, published, style, issue);
		}
	}
	
	public void updateItemByID(int id, String name, String published, String category, int issue, boolean supplement){
		Magazine M;
		Item I = findItemByID(id);
		if (I instanceof Magazine){
			M = (Magazine) I;
			M.updateItem(name, published, category, issue, supplement);
		}
	}
	
	public void updatePersonByID(int id, String name, String gender, String signed){
		Person P = findPersonByID(id);
		P.updatePerson(name, gender, signed);
	}
		
	public void checkOut(int iid, int pid){
		
		Item I = findItemByID(iid);
		Person P = findPersonByID(pid);
		
		//create objects for date handling
		GregorianCalendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//generate current date
		Date today = cal.getTime();
		String outDate = sdf.format(today);
		
		System.out.println(I.Name + " checked out by " + P.Name + " on " + outDate);
		
		I.Available = false;
		I.out = today;
	    
		//generate date 1 week from now
		cal.add(Calendar.WEEK_OF_MONTH, 1);
	    Date due = cal.getTime();
	    
	    I.in = due;
	    
	    //convert due date to string
	    String dueDate = sdf.format(due);
	    
	    System.out.println("Due to be returned on " + dueDate + "\n");
	    
	    I.borrowedBy = P.Name;
	    P.Borrowing.add(I);
	    P.returnDates.add(dueDate);
	}
	
public void checkIn(int iid, int pid){
		
		Item I = findItemByID(iid);
		Person P = findPersonByID(pid);
		int index = 0;
		String due;
		
		for(Item x: P.Borrowing){
			if (x == I){
				index = P.Borrowing.indexOf(I);
				due = P.returnDates.get(index);
				P.Borrowing.remove(I);
				P.returnDates.remove(due);
				I.out = null;
				I.in = null;
				I.Available = true;
				I.borrowedBy = "";
				break;
			}
		}
	}
}
