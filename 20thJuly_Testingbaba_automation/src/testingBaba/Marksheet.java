package testingBaba;

import java.util.Scanner;

public class Marksheet {

	public void calcPercantage(int math, int science, int sst, int hindi, int eng)
	{
		
      int totalMarks=math + science + sst + hindi + eng;
      float percentage = (totalMarks*100)/500;
      System.out.println("marks obtain in math :" + math);
      System.out.println("marks obtain in science :" + science);
      System.out.println("marks obtain in sst :" + sst);
      System.out.println("marks obtain in hindi :" + hindi);
      System.out.println("marks obtain in eng :" + eng);
      System.out.println("total marks obtain :" + totalMarks);
      System.out.println("percentage obtain  :" + percentage);
	}
	public static void main(String[] args)
	{
		Marksheet ob = new Marksheet();
		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter you mark of math");
		int math = sc.nextInt();
		System.out.println("plese enter you mark of eng");
		int eng = sc.nextInt();
		System.out.println("plese enter you mark of hindi");
		int hindi = sc.nextInt();
		System.out.println("plese enter you mark of sst");
		int sst = sc.nextInt();
		System.out.println("plese enter you mark of science");
		int science = sc.nextInt();
		ob.calcPercantage(math, science, sst, hindi, eng);
	}
}
