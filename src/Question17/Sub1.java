package Question17;

public class Sub1 extends Base1 {

	public Sub1() {
		super(1000);
		System.out.println("default");
	}

	public Sub1(int input) {
		super(1000);
		System.out.println("Single parameter constructor of base1 class" + input);
	}

	public Sub1(int number1, int number2) {
		super(1000);
		System.out.println("Double parameter constructor of base1 class" + number1 + " " + number2);
	}
}
