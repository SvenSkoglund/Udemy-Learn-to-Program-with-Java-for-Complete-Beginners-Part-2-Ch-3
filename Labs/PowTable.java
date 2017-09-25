/* Write a program that uses nested for loops to print a table of the first 8 powers of the first 10
integers. */
package Labs;

public class PowTable 
{
    public static void main(String[] args) {
        int num = 0;
        int factor = 0;

        for (num = 1; num <= 10; num = num + 1) {
            for (factor = 1; factor <= 8; factor = factor + 1) {
                System.out.print((Math.pow(num,factor)) + "\t");
            }
            System.out.println("");
        }
    }
}
