/*Write a program that accepts two numbers 
and a character as input. The character will represent a
mathematical operation to perform on the numbers:

Use a switch statement to determine whether the character 
is a +, -, *, or /, and perform the desired calculation 
on the numbers and print the result:*/
 
 package Labs;

public class LoopCalc
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float num1 = 1f;
		float num2 = 1f;
		float ans = 0.0f;		
		char op = '*';

		while ( num1 != 0 || num2 != 0)
		{
			System.out.println();
			System.out.print("Please enter the first number: ");
			num1 = scanner.nextFloat();
			
			System.out.println();
			System.out.print("Please enter / * + or - : ");
			op = scanner.next().charAt(0);
			System.out.println();
			
			System.out.print("Please enter the second number: ");
			num2 = scanner.nextFloat();
			
			
			
			
			switch (op) 
			{
				case '/' :
				ans = num1 / num2 ; 
				System.out.println(num1 + " / " + num2 + " = " + ans);
				break;
				
				case '*' : 
				ans = num1 * num2 ;
				System.out.println(num1 + " * " + num2 + " = " + ans);			
				break;
				
				case '+' :
				ans = num1 + num2 ;
				System.out.println(num1 + " + " + num2 + " = " + ans);			
				break;
				
				case '-' :
				ans = num1 - num2 ;
				System.out.println(num1 + " - " + num2 + " = " + ans);			
				break;
				
				default:
				System.out.println();
				System.out.println("!!Invald entry!! \u0007");
			}
		}
		scanner.close();	

	}
}