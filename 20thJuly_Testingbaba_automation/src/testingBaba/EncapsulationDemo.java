package testingBaba;


public class EncapsulationDemo {

	private String name;
	private int rollnu;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setRollNu(int rollnu)
	{
		this.rollnu = rollnu;
	}
	public int getRollNu()
	{
		return rollnu;
	}
	public static void main(String[] args) {
		EncapsulationDemo ob = new EncapsulationDemo();
		ob.setName("noida");
		System.out.println(ob.getName());;
	}
}
