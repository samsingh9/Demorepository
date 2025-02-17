package testingBaba;

public class ThrowsDemo {

	
	public static void syncwait() throws Exception
	{
		Thread.sleep(2000);
		System.out.println("2 second wait done");
	}
	public static void main(String[] args) throws Exception 
	{
		syncwait();
	}
}
