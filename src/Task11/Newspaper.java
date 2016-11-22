package Task11;

import java.text.SimpleDateFormat;

public class Newspaper extends Item{
	String Style;
	int Issue;
	
	public Newspaper(){}
	
	public Newspaper(int id, String name, String published, String style, int issue){
		super(id, name, published);
		this.Style = style;
		this.Issue = issue;
	}
	
	public void updateItem(String name, String published){
		this.Name = name;
		this.Published = published;
	}
	
	public void updateItem(String name, String published, String style, int issue){
		updateItem(name, published);
		this.Style = style;
		this.Issue = issue;
	}
	
	public void print(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("ID:\t\t" + ID);
		System.out.println("Name:\t\t" + Name);
		System.out.println("Published:\t" + Published);
		System.out.println("Style:\t\t" + Style);
		System.out.println("Issue No.:\t" + Issue);
		System.out.println("Available:\t" + Available);
		if (Available == false){
			System.out.println("Borrowed by " + borrowedBy + " on " + sdf.format(out));
			System.out.println("Due to be returned on " + sdf.format(in));
		}
		System.out.print("\n");
	}
}
