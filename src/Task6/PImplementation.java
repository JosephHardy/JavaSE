package Task6;

public class PImplementation {
	public static void main(String[] args){
		PaintRoom P = new PaintRoom();
		int size = 400;
		
		Paint p1 = new Paint("CheapoMax", 19.99, 20, 10);
		Paint p2 = new Paint("AverageJoes", 17.99, 15, 11);
		Paint p3 = new Paint("DuluxourousPaints", 25.00, 10, 20);
		
		P.addPaint(p1);
		P.addPaint(p2);
		P.addPaint(p3);
		
		Paint p = P.getPaint(0);
		System.out.println(P.CansNeeded(size, p));
		
		System.out.println(P.bestPrice(size));
		System.out.println(P.leastWaste(size));
	}
}
