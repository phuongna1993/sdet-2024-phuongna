package day01_kieudulieutrongJava;

import java.util.Scanner;

public class bai_03 {
    public static void main(String[] args) {

        /**
         * Nhap mot so nguyen tu ban phim
         * Check va in ra ket qua do la so chan hay le
         */

        //Create Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so nguyen:  ");
        int myNum = scanner.nextInt();

        // Check number

        boolean isOdd = (myNum % 2 != 0);

        // Print result
        if (isOdd) {
            System.out.println("Day la so le");
        } else
            System.out.println("Day la so chan");
    }
}