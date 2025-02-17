package testingBaba;

class NewA
{	
	public NewA(int num)
	{
		System.out.println("hi java");
	}
}
public class ConstructorWithInheritance extends NewA
{

   public ConstructorWithInheritance()
   {
	   super(10);
	   System.out.println("hello world");
   }
   public static void main(String[] args) 
   {
	   ConstructorWithInheritance ob = new ConstructorWithInheritance();  
   }
}
