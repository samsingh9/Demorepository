package testingBaba;

public class MethodOverLoadingDemo {

	public void getTraingDetails(int pnr, String name)
	{
		System.out.println("your traing details accroding to :" + pnr);
	}
	public void getTraingDetails(String trainName, int trainNumber)
	{
		System.out.println("your traing details accroding to :" + trainName);
	}
	public void getTraingDetails(String fromStn, String tsStn)
	{
		System.out.println("your traing details accroding to from station and to station");
	}
	public static void main(String[] args) {
		MethodOverLoadingDemo ob = new MethodOverLoadingDemo();
		ob.getTraingDetails("newdelhi", "noida");
	}
}
