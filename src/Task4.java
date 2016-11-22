
public class Task4 {
	public static void main(String args[]){
		String s = "String";
		int len = s.length();
		char sArray[];
		sArray = new char[len];
		for (int i = 0; i < len; i++){
			sArray[i] = s.charAt(len - 1 - i);
		}
		System.out.print(sArray);
	}
}
