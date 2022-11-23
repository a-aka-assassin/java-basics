
public class Headphone {
	
	String brand = "Jabra";
	String charge = "MicroUsb";
	String[] controls = {"power","volume","skip","play/pause"};
	String color = "black";
	
	static boolean powerOn = true;
	static int volume = 5;
	
	public static void poweron() {
		powerOn = true;
	}
	
	public static void powerOff() {
		powerOn = false;
	}
	
	public static void volumeUp() {
		volume++;
	}
	
	public static void volumeDown() {
		volume--;
	}
}
