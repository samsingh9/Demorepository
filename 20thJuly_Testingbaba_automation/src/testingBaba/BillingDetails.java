package testingBaba;

import java.util.Scanner;

public class BillingDetails {

	public void printBill(String pname, long number, String name, int price)
	{
		float gst=(price*18)/100;
	float totalprice=gst + price;
	System.out.println("Name of the user is : " + name);
	System.out.println("mobile numebr of the user is : " + number);
	System.out.println("product purchased by the user : " + pname);
	System.out.println("price of the product : " + price);
	System.out.println("gst calculated : " + gst);
	System.out.println("total price of the product is : " + totalprice);
	}
	public static void main(String[] args) {
		BillingDetails ob = new BillingDetails();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your name");
		String name = sc.next();
		System.out.println("please enter you mobile number");
		long number=sc.nextLong();
		System.out.println("please enter you product name");
		String pname=sc.next();
		System.out.println("please enter product price");
		int price=sc.nextInt();
		ob.printBill(pname, number, name, price);
	}
}
