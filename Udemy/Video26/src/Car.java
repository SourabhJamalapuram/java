public class Car extends Machine{
	public void start(){
		System.out.println("Car started");
	}
	
	public void wipeWindSheild(){
		System.out.println("Wiping windshield");
	}
	
	public void showInfo(){
		System.out.println("Car name:" + name);
	}
}