/* Write a program that uses a for loop to print the first 20 Fibonacci numbers. Remember
that the first two (known as f0 and f1) are predefined as 0 and 1. All subsequent numbers
are calculated from there. */


package Labs;

public class Fib
{
	public static void main (String [] Args)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("0:"+a);
		System.out.println("1:"+b);
		int i;
		for (i = 0 ; i <= 20 ; i = i + 1)
		{				
			c = a + b;
			System.out.println(i + ":" + c);
			a = b;
			b = c;

		}
	}
}