/*(Optional) Make a copy of your solution to , the Fibonacci number exercise. Modify the copy
to calculate only the first 10 Fibonacci numbers. Instead of printing the value of the Fibonacci
number, use a nested for loop to print a row of asterisks whose length is the current Fibonacci
number. */


package Labs;

public class FibGraph
{
	public static void main (String [] Args)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("0:");
		System.out.println("1:*");
		int i;
		for (i = 0 ; i <= 10 ; i = i + 1)
		{				
		c = a + b;
		System.out.print(i+":");		
		int k;
			for (k = 0 ; k <= c; k=k+1){
		
			System.out.print("*");
			}
			System.out.println();
			a = b;
			b = c;

		}
	}
}