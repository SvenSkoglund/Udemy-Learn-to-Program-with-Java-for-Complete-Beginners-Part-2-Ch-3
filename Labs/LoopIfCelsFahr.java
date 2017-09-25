/* Modify your temperature conversion program from the previous chapter and use a loop that will
allow for 5 different temperatures to be input and converted. */
 
 package Labs;

public class LoopIfCelsFahr 
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float [] temp;
		temp = new float[5];
		float [] conv;
		conv = new float[5];
		char fc = 'f';
		
		int i;
		for (i = 0 ; i <5 ; i = i + 1 )
		{
			System.out.println();
			System.out.print("Please enter temperature " + (i+1) +": ");
			temp[i] = scanner.nextFloat();
		}
		
		System.out.println();
		System.out.print("Please enter C for Celsius or F for Fahrenheit: ");
		fc = scanner.next().charAt(0);
		System.out.println();
		
		
		scanner.close();
		
		if ((fc == 'F') || (fc == 'f'))
		{
			for (i = 0 ; i <5 ; i = i + 1 )
			{
				conv[i] = ((temp[i] - 32) / ( 1.8f ));
				System.out.println( temp[i] + " degrees Farenheit equals " 
				+ conv[i] + " degrees Celcius");
				System.out.println();
			}
			
		}
		else if (( fc == 'C') || ( fc == 'c'))
		{
			for (i = 0 ; i <5 ; i = i + 1 )
			{
				conv[i] = (temp[i] * ( 1.8f ) + 32);
				System.out.println( temp[i] + " degrees Celsius equals " 
				+ conv[i] + " degrees Farenheit");
				System.out.println();
			}
		}
		else
			System.out.print("**Invalid Entry**");
	}
}