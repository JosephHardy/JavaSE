package Task11;

import java.text.SimpleDateFormat;

public class Magazine extends Item{
	String Category;
	int Issue;
	boolean Supplement;
	
	public Magazine(){}
	
	public Magazine(int id, String name, String published, String category, int issue, boolean supplement){
		super(id, name, published);
		this.Category = category;
		this.Issue = issue;
		this.Supplement = supplement;
	}
	
	public void updateItem(String name, String published){
		this.Name = name;
		this.Published = published;
	}
	
	public void updateItem(String name, String published, String category, int issue, boolean supplement){
		updateItem(name, published);
		this.Category = category;
		this.Issue = issue;
		this.Supplement = supplement;
	}
	
	public void print(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("ID:\t\t" + ID);
		System.out.println("Name:\t\t" + Name);
		System.out.println("Published:\t" + Published);
		System.out.println("Category:\t" + Category);
		System.out.println("Issue No.:\t" + Issue);
		System.out.println("Supplement:\t" + Supplement);
		System.out.println("Available:\t" + Available);
		if (Available == false){
			System.out.println("Borrowed by " + borrowedBy + " on " + sdf.format(out));
			System.out.println("Due to be returned on " + sdf.format(in));
		}
		System.out.print("\n");
	}
}
