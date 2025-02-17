package testingBaba;

public class ThisWithMethod {

	public  ThisWithMethod()
	{
	this(10);
		System.out.println("Constructor of class ThisWithMethod");
		
	}
	public  ThisWithMethod(int num)
	{
		
		System.out.println("COnstructor B of class ThisWithMethod");
	}
	public static void main(String[] args) {
		ThisWithMethod ob = new ThisWithMethod();
		
	}
}
