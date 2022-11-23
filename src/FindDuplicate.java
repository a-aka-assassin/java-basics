import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		
		System.out.println("Please enter a sentence to find the duplicates:");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		String characters = "";
		String duplicates ="";
		
		for(int i = 0; i < sentence.length(); i++) {
			
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				
				if(!duplicates.contains(current)) {
				duplicates = duplicates+sentence.charAt(i)+",";
				}
			}
			characters = characters + sentence.charAt(i);
			
		}
			System.out.println("The characters which are duplicates are: " + duplicates);
	}

}
