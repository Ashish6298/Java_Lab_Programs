import java.util.*;

interface onlinegames {
    void AddPlayers();

    void ChooseLevel();

    void printstate();
}

class TicTacToe implements onlinegames {
    String player1, player2, s;
    int choice;
    Scanner in = new Scanner(System.in);

    public void AddPlayers() {
        System.out.println("Enter the player1: ");
        player1 = in.nextLine();
        System.out.println("Enter the player2: ");
        player2 = in.nextLine();
    }

    public void ChooseLevel() {
        System.out.println("Choose the level \n1 Easy \n2 Medium \n3 Difficult");
        choice = in.nextInt();
        System.out.println("Your choice: ");
        switch (choice) {
            case 1:
                s = "Easy";
                break;
            case 2:
                s = "Medium";
                break;
            case 3:
                s = "Difficult";
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void printstate() {
        System.out.println("Game: TicTacToe \n Player1: " + player1 + "\n Player2: " + player2 + "\n Level: " + s);
    }
}

class SnakeLadder implements onlinegames {
    String player1, player2, s;
    int choice;
    Scanner in = new Scanner(System.in);

    public void AddPlayers() {
        System.out.println("Enter the player1: ");
        player1 = in.nextLine();
        System.out.println("Enter the player2: ");
        player2 = in.nextLine();
    }

    public void ChooseLevel() {
        System.out.println("Choose the level \n1 Easy \n2 Medium \n3 Difficult");
        choice = in.nextInt();
        System.out.println("Your choice: ");
        switch (choice) {
            case 1:
                s = "Easy";
                break;
            case 2:
                s = "Medium";
                break;
            case 3:
                s = "Difficult";
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void printstate() {
        System.out.println("Game: SnakeLadder \n Player1: " + player1 + "\n Player2: " + player2 + "\n Level: " + s);
    }
}

class Chess implements onlinegames {
    String player1, player2, s;
    int choice;
    Scanner in = new Scanner(System.in);

    public void AddPlayers() {
        System.out.println("Enter the player1: ");
        player1 = in.nextLine();
        System.out.println("Enter the player2: ");
        player2 = in.nextLine();
    }

    public void ChooseLevel() {
        System.out.println("Choose the level \n1 Easy \n2 Medium \n3 Difficult");
        choice = in.nextInt();
        System.out.println("Your choice: ");
        switch (choice) {
            case 1:
                s = "Easy";
                break;
            case 2:
                s = "Medium";
                break;
            case 3:
                s = "Difficult";
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void printstate() {
        System.out.println("Game: Chess \nPlayer1: " + player1 + "\nPlayer2: " + player2 + "\nLevel: " + s);
    }
}

public class onlinemultiplegames {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("\n Enter the game to play: \n 1.TicTacToe \n 2.SnakeLadder \n 3.Chess \n 4.Exit");
            n = a.nextInt();
            switch (n) {
                case 1:
                    TicTacToe tic = new TicTacToe();
                    tic.AddPlayers();
                    tic.ChooseLevel();
                    tic.printstate();
                    break;
                case 2:
                    SnakeLadder snake = new SnakeLadder();
                    snake.AddPlayers();
                    snake.ChooseLevel();
                    snake.printstate();
                    break;
                case 3:
                    Chess c = new Chess();
                    c.AddPlayers();
                    c.ChooseLevel();
                    c.printstate();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
                    return;

            }
        }
    }
}
