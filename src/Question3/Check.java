package Question3;

public class Check {
	//Instance members
	String defVar = "default variable";
	private String priVar = "priavte  variable";
	protected String protVar = "protected  variable";
	public String pubVar = "public variable";

	void disp() {
		System.out.println(defVar + " directly accessible");
		System.out.println(protVar + " directly accessible but within the same package or child class");
		System.out.println(pubVar + " directly accessible");
		System.out.println(priVar + " No access");
	}
}
