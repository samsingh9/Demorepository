package testingBaba;

public class ExceptionDemoNew {

	public void calculate()
	{
	   try
	   {
		   int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
	   }
	   finally
	   {
		System.out.println("finally block ");
	}
	}
	public void print()
	{
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		ExceptionDemoNew ob = new ExceptionDemoNew();
		ob.calculate();
		ob.print();
	}
}
