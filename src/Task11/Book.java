package Task11;

import java.text.SimpleDateFormat;

public class Book extends Item {
	String Author;
	String Genre;
	boolean Hardback;
	
	public Book(){}
	
	public Book(int id, String name, String published, String author, String genre, boolean hardback){
		super(id, name, published);
		this.Author = author;
		this.Genre = genre;
		this.Hardback = hardback;
	}
	
	public void updateItem(String name, String published){
		this.Name = name;
		this.Published = published;
	}
	
	public void updateItem(String name, String published, String author, String genre, boolean hardback){
		updateItem(name, published);
		this.Author = author;
		this.Genre = genre;
		this.Hardback = hardback;
	}
	
	public void print(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("ID:\t\t" + ID);
		System.out.println("Name:\t\t" + Name);
		System.out.println("Published:\t" + Published);
		System.out.println("Author:\t\t" + Author);
		System.out.println("Genre:\t\t" + Genre);
		System.out.println("Hardback:\t" + Hardback);
		System.out.println("Available:\t" + Available);
		if (Available == false){
			System.out.println("Borrowed by " + borrowedBy + " on " + sdf.format(out));
			System.out.println("Due to be returned on " + sdf.format(in));
		}
		System.out.print("\n");
	}
}
