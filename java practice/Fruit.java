import java.util.*;

class NotEnoughFruits extends Exception {
    NotEnoughFruits(String s) {
        super(s);
    }
}

class BoxFullException extends Exception {
    BoxFullException(String s) {
        super(s);
    }
}

class LowStockException extends Exception {
    LowStockException(String s) {
        super(s);
    }
}

class Fruits {
    String fruitname;
    int qty;

    // zero parameter constructor
    Fruits() {
        fruitname = "apple";
        qty = 0;
    }

    // parametrized constructor
    Fruits(String fruitname, int qty) {
        this.fruitname = fruitname;
        this.qty = qty;
    }

    // method to add fruits
 void AddFruits(int num) throws BoxFullException {
 if (qty + num > 100) {
 throw new BoxFullException("Box is almost full. You can add only " + (100-qty) + "
fruits.");
 }
 qty += num;
 }

    void UseFruits(int num) throws NotEnoughFruits, LowStockException {
        if (qty - num < 0) {
            throw new NotEnoughFruits("You have only " + qty + " number of fruits.");
        }
        if (qty - num == 0) {
            throw new LowStockException("Stock is low, please add more fruits.");
        }
        qty -= num;
    }
}

public class Fruit {
    public static void main(String[] args) {
        int num, num1;
        Scanner sc = new Scanner(System.in);

        Fruits L = new Fruits("Mango", 70);
        try {

            System.out.println("Enter the no of fruits to be placed in the box");
            num = sc.nextInt();
            L.AddFruits(num);

            System.out.println("Enter the no of fruits removed from the box");
            num1 = sc.nextInt();
            L.UseFruits(num1);

        } catch (Exception PowerOffException) {
            System.out.println(PowerOffException.getMessage());
        }

    }

}
