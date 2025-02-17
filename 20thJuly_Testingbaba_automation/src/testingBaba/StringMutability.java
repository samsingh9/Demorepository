package testingBaba;

public class StringMutability {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("java");
		
		long starttime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
		{
		buffer.append(" program");
		}
		long actualtime = System.currentTimeMillis() - starttime;
		System.out.println(actualtime);
		
		
		StringBuilder builder = new StringBuilder("java");
		
		starttime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
		{
		builder.append( " program");
		}
	     actualtime = System.currentTimeMillis() - starttime;
		System.out.println(actualtime);
	}
}
