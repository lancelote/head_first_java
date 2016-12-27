class GuessGame {

    void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessP1;
        int guessP2;
        int guessP3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Guessing the number from 0 to 9 ...");

        while (true) {
            System.out.println("The number to guess - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("First player thinks it's " + guessP1);

            guessP2 = p2.number;
            System.out.println("Second player thinks it's " + guessP2);

            guessP3 = p3.number;
            System.out.println("Third player thinks it's " + guessP3);

            if (guessP1 == targetNumber) {
                p1isRight = true;
            }
            if (guessP2 == targetNumber) {
                p2isRight = true;
            }
            if (guessP3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Did the first player guess correctly? " + p1isRight);
                System.out.println("Did the second player guess correctly? " + p2isRight);
                System.out.println("Did the third player guess correctly? " + p3isRight);
                System.out.println("The game is finished!");
                break;
            } else {
                System.out.println("Let's try one more time!");
            }
        }
    }
}

class Player {
    int number = 0;

    void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I think it's " + number);
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
