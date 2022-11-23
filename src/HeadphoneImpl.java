
public class HeadphoneImpl {

	public static void main(String[] args) {
		
		Headphone h = new Headphone();
		
		System.out.println(h.brand);

		System.out.println(h.charge);

		System.out.println(h.color);
		
		System.out.println(h.powerOn);
		
		h.poweron();

		System.out.println(h.powerOn);
		
		h.powerOff();
		System.out.println(h.powerOn);
		
		System.out.println(h.volume);
		h.volumeUp();

		System.out.println(h.volume);
		h.volumeDown();

		System.out.println(h.volume);
		
		
	}

}
