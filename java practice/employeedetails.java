import java.util.Scanner;

class employee {
    String empname;
    String empid;
    double salary;
    long phno;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee id");
        empid = s.next();
        System.out.println("Enter the employee name");
        empname = s.next();
        System.out.println("Enter the salary");
        salary = s.nextDouble();
        System.out.println("Enter the phone number");
        phno = s.nextLong();
    }

    public void output() {
        System.out.println(empid + "\t" + empname + "\t" + salary + "\t" + phno);

    }

}

public class employeedetails {
    public static void main(String[] args) {

        employee e[] = new employee[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            e[i] = new employee();
            e[i].read();
        }
        System.out.println("empid\tempname\tsalary\tphno");
        for (int i = 0; i < n; i++) {
            e[i].output();
        }

    }
}