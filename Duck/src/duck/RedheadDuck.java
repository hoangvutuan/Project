package duck;

public class RedheadDuck extends Duck implements Quackable, Flyable {
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}