package testingBaba;

public class StaticDemo {

	int a = 10;

	public void increment() {
		a++;
		System.out.println(a);
	}

	static {
		System.out.println("this is static block");
	}

	public StaticDemo() {
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
	}
}
