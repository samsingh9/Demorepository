package testingBaba;

class Demo
{
  public Demo()
  {
	  System.out.println("construcotr of DEmo Class");
  }
}
public class ConsructorDemo extends Demo {

	public ConsructorDemo()
	{
		System.out.println("it is a non parameterized constructor");
	}
	public static void main(String[] args) {
		ConsructorDemo ob1 = new ConsructorDemo();
		//ConsructorDemo ob2 = new ConsructorDemo(10);
		
	}
}
