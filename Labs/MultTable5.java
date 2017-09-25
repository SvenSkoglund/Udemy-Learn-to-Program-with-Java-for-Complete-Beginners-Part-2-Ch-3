package Labs;

public class MultTable5 
{
    public static void main(String[] args) {
        int num = 0;
        int factor = 0;

        for (num = 1; num <= 10; num = num + 1) {
            for (factor = -5; factor <= 5; factor = factor + 1) {
                System.out.print((num * factor) + "\t");
            }
            System.out.println("");
        }
    }
}
