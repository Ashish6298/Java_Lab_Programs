import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class salary {
    public static void main(String[] args) {
        int i, n = 5;
        int count = n;
        double list[] = new double[n + 1];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the salary of all employee");
        for (i = 1; i < n + 1; i++) {
            list[i] = s.nextDouble();
        }
        Arrays.sort(list);
        System.out.println("The salary table is");
        for (i = count; i > 0; i++) {
            for (int j = n; j <= i; j++) {
                System.out.println(list[count--]);
                if (count == 0) {
                    System.out.println();

                    return;
                }

            }
            System.out.println();
        }
    }
}