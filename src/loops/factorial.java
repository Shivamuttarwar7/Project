package loops;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		long factorial=1;
		
		for(int i=1; i<=n; i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial is "+ factorial);
		

	}

}
