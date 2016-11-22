package Task11;

public class LImplementation {
	public static void main(String[] args){
		Library l = new Library();
	
		Item i1 = new Book(1, "I was a Teenage Billionaire Psychopath", "04/07/2006", "Jeffrey Rowland", "Fiction - Autobiography", false);
		Item i2 = new Newspaper(2, "The Week", "17/09/2016", "Tabloid", 150);
		Item i3 = new Magazine(3, "Cardboard Monthly", "05/05/2013", "Hobbies & Interests", 94, false);
	
		l.addItem(i1);
		l.addItem(i2);
		l.addItem(i3);
		
		//l.printItems();
		
		Person p1 = new Person(1, "Noah Antwiler", "M", "18/12/1956");
		Person p2 = new Person(2, "Doug Manilow", "M", "01/03/1987");
		Person p3 = new Person(3, "Jennifer Hepler", "F", "30/05/1993");
		
		l.registerPerson(p1);
		l.registerPerson(p2);
		l.registerPerson(p3);
		
		//l.printPeople();
		
		l.updateItemByID(1, "50 Sheds of Grey", "14/11/2016", "Maureen Briggs", "Non-Fiction - Autobiography", true);
		l.updateItemByID(2, "The Snu", "11/09/1995", "Broadsheet", 56);
		l.updateItemByID(3, "Side Parting Weekly", "27/12/1988", "Fashion", 68, true);
		
		//l.printItems();
		
		l.removeItemByID(2);
		
		l.printItems();
		
		l.updatePersonByID(2, "Jennifer Hale", "F", "19/02/28");
		
		l.removePersonByID(3);
		
		//l.printPeople();
		
		l.checkOut(1, 1);
		l.checkOut(3, 1);
		
		l.printItems();
		
		l.checkIn(1, 1);
		
		l.printItems();
		
	}
}
