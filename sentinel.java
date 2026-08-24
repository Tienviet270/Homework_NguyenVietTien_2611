package Lec05_Condition;

import java.util.*;

public class sentinel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tong = 0, sl = 0, tb = 0;
        double a;
        do {
            System.out.println("Nhap so thuc :");
            a = scan.nextDouble();
            tong += a;
            sl++;
            tb = tong / sl;
        } while (a != 0);
        if (tb > 0 && tong > 0) {
            System.out.println("Tong : " + tong);
            System.out.println("So luong : " + sl);
            System.out.println("trung binh : " + tb);
        } else {
            System.out.println("Khong co du lieu");
        }
    }
}