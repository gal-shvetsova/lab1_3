package lab1_3;

public class Main {

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        if (guessNumber.game())
            System.out.println("You won!");
        else
            System.out.println(("You lose!"));
    }
}
