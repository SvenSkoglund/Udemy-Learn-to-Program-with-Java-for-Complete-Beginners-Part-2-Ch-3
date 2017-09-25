/* Modify your solution so that in addition to the running sum, the program also calculates the
average of the numbers so far. Have it print the average, as well as the count of the
numbers entered so far.*/


package Labs;

public class RunningSumAvg
{
	public static void main (String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int ent = 1;
		int sum = 0;
		float avg = 1;
		System.out.println("\t\t\tEnter \t Sum \t Avg");
		while (ent !=0)
		{
			System.out.print("Enter a number: ");
			ent = scanner.nextInt();
			sum = sum + ent;
			System.out.print("\t\t\t"+ent+"\t"+sum + "\t" + (sum/avg));
			avg=avg+1;
			System.out.println();
		}
	}
}