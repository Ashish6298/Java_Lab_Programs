import java.util.Scanner;
import java.io.*;

public class circle {
    static int choice(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (choice(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n and k");
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println("The choosen place is " + choice(n, k));
    }

}