package Abstraction;

public class AbstractImpl {

	public static void main(String[] args) {
		Shepherd object = new Shepherd();
		object.breed = "German";
		object.color = "Black";
		
		object.bark();
		object.sniff();
		System.out.println(object.breed);
	}

}
