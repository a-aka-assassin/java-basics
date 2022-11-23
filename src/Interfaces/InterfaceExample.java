package Interfaces;

public class InterfaceExample implements Fun {

	public static void main(String[] args) {
		System.out.println(color);
		System.out.println(howmuch);
		InterfaceExample object = new InterfaceExample();
		object.fillUp();
		object.pouroOut();
	}

	@Override
	public void fillUp() {
		System.out.println("It is filled Up");
		
	}

	@Override
	public void pouroOut() {
		System.out.println("It is empty Now");
		
	}

}
