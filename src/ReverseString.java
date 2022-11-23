import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to be reversed: ");
		
		String object = input.nextLine();
		String newString = reverse(object);
		System.out.println(newString);
	}
	
	public static String reverse(String s) {
		char[] characters = new char[s.length()];
		
		int customIndex = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			characters[customIndex] = s.charAt(i);
			customIndex++;
		}
		
		String reversed = "";
		for(int i = 0; i < s.length(); i++) {
			reversed = reversed + characters[i];
		}
		return reversed;
	}

}
