
public class Task3 {
	public static void main(String args[]){
		String s = "String";
		int len = s.length();
		while (len > 0){
			System.out.print(s.charAt(len - 1));
			len--;
		}
	}
}