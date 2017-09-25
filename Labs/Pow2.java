/*Make a copy of your solution and modify it so that, in addition to printing the first 16
multiples of 2, it also prints the first 16 powers of 2. Have both the multiple and the power
print on the same line. */

package Labs;

public class Pow2
{
	public static void main(String [] Args)
	{
		
		int i;
		for (i = 1 ; i <= 16 ; i = i +1)
		{
			System.out.print(2*i + " ");
		}
		
		
		for (i = 1 ; i <= 16 ; i = i +1)
		{
			System.out.print(Math.pow(2,i) + " ");
		}
	}
	
}