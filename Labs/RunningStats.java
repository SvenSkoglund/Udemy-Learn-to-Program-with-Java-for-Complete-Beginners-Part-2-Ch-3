/* Modify your solution so that in addition to the running sum, the program also calculates the
average of the numbers so far. Have it print the average, as well as the count of the
numbers entered so far.*/


package Labs;

public class RunningStats
{
	public static void main (String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int ent = 1;
		int sum = 0;
		int avg = 1;
		int small = 1000000000;
		int large = 0;
		System.out.println("\t\t\tEnter \t Sum \t Avg \t Small \t Large");
		while (ent !=0)
		{
			System.out.print("Enter a number: ");
			ent = scanner.nextInt();
			
			if (ent < small)
			{
				small=ent;
			}
			if (ent > large)
			{
				large = ent;
			}
			sum = sum + ent;
			System.out.print("\t\t\t"+ent+"\t"+sum + "\t" + (sum/avg) +"\t"+small+"\t"+large);
			avg=avg+1;
			System.out.println();
		}
	}
}