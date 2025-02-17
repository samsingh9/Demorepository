package testingBaba;

public class ThisDemo {
	String name;
	int number;
	
	public void addDetails(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	public void printDetails()
	{
		System.out.println(name + " and " + number);
	}
	public static void main(String[] args) {
		ThisDemo ob = new ThisDemo();
		ob.addDetails("aman", 11);
		ob.printDetails();
	}
}
