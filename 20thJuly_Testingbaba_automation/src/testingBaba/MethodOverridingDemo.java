package testingBaba;

class GST
{
	public void calcGst(int amount)
	{
		float gst =(amount*5)/100;
		System.out.println(gst);
	}
}
public class MethodOverridingDemo extends GST
{
	public void calcGst(int amount)
	{
		
		float gst =(amount*18)/100;
		System.out.println(gst);
		super.calcGst(amount);
	}
	public static void main(String[] args) {
		GST ob = new MethodOverridingDemo();
		ob.calcGst(1000);
	}
}
