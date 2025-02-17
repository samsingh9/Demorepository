package testingBaba;

public class ArrayDemo {

	protected void arraydemo()
	{
		int[] num = new int[5];
		num[4] = 10;
		num[1] = 15;
		num[2] = 1;
		num[3] = 3;
		num[0] = 28;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
	}
	public static void main(String[] args) {
		ArrayDemo ob = new ArrayDemo();
		ob.arraydemo();
	}
}
