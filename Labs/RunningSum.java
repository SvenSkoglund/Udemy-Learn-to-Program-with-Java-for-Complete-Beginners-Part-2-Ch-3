/*Write a program with an infinite loop, reading a floating-point number from the user at each
iteration. The program should maintain the sum of the numbers entered so far. Have the
program exit when the user enters zero. At each iteration, print the last number entered, and
the current sum. Print the data in a tabular format:*/


package Labs;

public class RunningSum
{
	public static void main (String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int ent = 1;
		int sum = 0;
		
		System.out.println("\t\t\tEnter \t Sum");
		while (ent !=0)
		{
			System.out.print("Enter a number: ");
			ent = scanner.nextInt();
			sum = sum + ent;
			System.out.print("\t\t\t"+ent+"\t"+sum);
			System.out.println();
		}
	}
}