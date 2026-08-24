package Lec05_Loop;

import java.util.*;

public class RandomNumberPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int wrong = 0;
        do {
            int sohang = random.nextInt(5 - 2 + 1) + 2;
            int tong = 0;
            for (int i = 1; i <= sohang; i++) {
                int randomNumber = random.nextInt(10) + 1;
                System.out.print(randomNumber);
                tong += randomNumber;
                if (i < sohang) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = ");
                }
            }
            int answer = scanner.nextInt();
            if (answer == tong) {
                score++;
                System.out.println("Ban da lam dung");
                System.out.println("So diem : " + score);
            } else {
                wrong++;
                System.out.println("Dap an sai");
                System.out.println("So lan lam sai: " + wrong);
            }
        } while (wrong < 3);
        System.out.println("Ban Da Thua");
        System.out.println("Tong diem la: " + score);
    }
}
