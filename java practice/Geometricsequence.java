import java.util.Scanner;

public class Geometricsequence {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nth term");
        n = s.nextInt();
        if (n % 2 == 0) {
            n = n / 2;
            System.out.println("The nth term is " + Math.pow(3, n - 1));
        } else

        {
            n = n / 2 + 1;
            System.out.println("The nth term is " + Math.pow(2, n - 1));
        }

    }
}