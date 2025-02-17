package testingBaba;

import java.util.Scanner;

public class BillDetails 
{
	public float calculateGst(int price)
	{
		float gst = (price*18)/100;
		return gst;
	}
	public static void main(String[] args)
	{
		BillDetails ob = new BillDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name");
		String name = sc.next();
		System.out.println("please enter your mobilenumber");
		long mobileno = sc.nextLong();
		System.out.println("please enter product");
		String productname = sc.next();
		System.out.println("please enter product price");
	    int price =	sc.nextInt();
	float calcgst= ob.calculateGst(price);
	float totalprice = price + calcgst;
	System.out.println("your name is " + name);
	System.out.println("your number is " + mobileno);
	System.out.println("your product is " + productname);
	System.out.println("price of the product is " + price);
	System.out.println("your gst calculated : " + calcgst);
	System.out.println("total price for the product : " + totalprice);
	}
}
