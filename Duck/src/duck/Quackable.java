package duck;

public interface Quackable {
	default void quack() {
		System.out.println("  quacking");
	}
}
