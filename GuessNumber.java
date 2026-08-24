package Lec06_Loop;

import java.util.*;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(20) + 1;
        int guess;
        int count = 0;
        do {
            System.out.print("Nhap so ban doan: ");
            guess = scanner.nextInt();
            count++;
            if (guess < randomNumber) {
                System.out.println("Ban can doan so LON HON!");
            } else if (guess > randomNumber) {
                System.out.println("Ban can doan so NHO HON!");
            } else {
                System.out.println("Chuc mung! Ban da doan dung!");
            }
        } while (guess != randomNumber);

        System.out.println("So lan ban da thu: " + count);
    }
}
