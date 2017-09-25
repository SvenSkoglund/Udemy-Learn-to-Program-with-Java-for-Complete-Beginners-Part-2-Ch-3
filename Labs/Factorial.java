/*Write a program that prints the factorials of the integers from 1 to 10. The factorial of a number N
is the product of all numbers less than or equal to N: factorial 1 (1!) is just one. 2! is (1 * 2) = 3.
3! is (1 * 2 * 3) = 6. 4! is (1 * 2 * 3 * 4) = 24. And so on. Have your program print the results in
a tabular format:*/


package Labs;

public class Factorial
{
	public static void main (String [] Args)
	{
		int f = 1;
		int i;
		for ( i = 1 ; i <= 10 ; i = i + 1)
		{
			f = f*i;
			System.out.println(i +"!\t=\t" + f);
		}
	}
}