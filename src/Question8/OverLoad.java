package Question8;

public class OverLoad {
	public static void main(String[] args) {
		Parent parent = new Parent();// Instatiating class
		parent.disp(); //Invoking disp
		Child child = new Child();// Instatiating class
		child.disp("hello");
	}
}
