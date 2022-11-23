package Capitalize;

public class CapPprogram {

	public static void main(String[] args) {
		String str1 = "how many letters are there?";
		String str2 = str1.substring(0,1).toUpperCase() + str1.substring(1);
		System.out.println(str2);
	}

}
