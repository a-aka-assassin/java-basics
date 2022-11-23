import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		System.out.println("How many stars would you like?");
		Scanner input = new Scanner(System.in);
		int numOfStar = input.nextInt();
		
		for(int i = 0; i <= numOfStar; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("*");
		}
		
		for(int i = numOfStar -1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
