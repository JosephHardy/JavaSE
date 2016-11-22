import java.util.Scanner;

public class Task2 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0; i <= num; i++){
			for (int j = i; j > 0; j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		in.close();
	}
}