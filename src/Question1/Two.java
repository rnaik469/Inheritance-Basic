package Question1;

public class Two {
	public static void main(String[] args) {
		First first = new First();
		System.out.println(first.name);// first class members,function,constructor
		first.disp();

		Second second = new Second();// Second class members,function,constructor
		second.disp();
		System.out.println(second.name);
	}
}
