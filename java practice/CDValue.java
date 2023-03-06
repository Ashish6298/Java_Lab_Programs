import java.util.Scanner;

class moneyclass {
    void calculate(int amt, int mt, float pr) {
        System.out.println("Month\tCD value");
        for (int i = 1; i < mt + 1; i++) {
            System.out.println(i + "\t" + amt + i * (pr / 12 * 100));
        }
    }
}

public class CDValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the initial amount");
        int amt = s.nextInt();
        System.out.println("Enter the months");
        int months = s.nextInt();
        System.out.println("Enter the percentage");
        float percentage = s.nextFloat();
        moneyclass m = new moneyclass();
        m.calculate(amt, months, percentage);

    }
}
