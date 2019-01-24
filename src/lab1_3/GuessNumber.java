package lab1_3;

import java.util.Scanner;

public class GuessNumber {
    private int number;
    public GuessNumber() {
        this.number = (int)(java.lang.Math.random() * 100 + 1) ;
    }
    public boolean game() {
        Scanner scanner = new Scanner(System.in);
        int user_num;
        for (int i = 1; i <= 8; i++ ) {
            System.out.println("Write number: ");
            user_num = scanner.nextInt();
            if (user_num > number)
                System.out.println("Less");
            else if (user_num == number) {
                System.out.println("Yes!");
                return true;
            }
            else if (user_num < number)
                System.out.println("More");
        }
        return false;
    }

}
