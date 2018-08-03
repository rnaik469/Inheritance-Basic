package Question2;

public class Test {
	public static void main(String[] args) {
		First first = new First();
		System.out.println(first.non_Static_Var);// static variable
		System.out.println(First.static_var);// non static variable
		First.functionNonStatic();// static function call
		First.functionStatic();// non static function call
	}
}
