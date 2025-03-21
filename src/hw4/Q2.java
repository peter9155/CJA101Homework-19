package hw4;

public class Q2 {
	public static void main(String args[]) {
		String s = "Hello World";
		char[] sArray = new char[s.length()];
		
		for (int i = 0; i < s.length() ; i++) {
			sArray[s.length() -1 -i] = s.charAt(i);
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]);
		}
	}

}
