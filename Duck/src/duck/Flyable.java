package duck;

public interface Flyable {
	default void fly() {
		System.out.println("  flying");
	}
}
