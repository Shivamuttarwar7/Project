package practice;
import java.util.*;

public class main{
	public static void area(int a, int b) {
		double area;
		area=0.5*a*b;
		print(area);
	}
	public static void print(double area) {
		System.out.println("Area of a Triangle is: "+ area);
		
	}

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of a triangle");
		a=sc.nextInt();
		System.out.println("Enter base of a triangle");
		b=sc.nextInt();
		area(a,b);
		
	}

}
