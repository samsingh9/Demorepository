package testingBaba;

abstract class Vehical
{
	public abstract void wheels();
	public void manufacture()
	{
		System.out.println("every vehicle manufactured in India");
	}
}
public class AbstractionDemo extends Vehical
{
@Override
public void wheels()
{
	System.out.println("Vehicle can have 2 wheels or 4 wheels");
	
}
public static void main(String[] args) {
	AbstractionDemo ob = new AbstractionDemo();
	ob.wheels();
	ob.manufacture();
}
}
