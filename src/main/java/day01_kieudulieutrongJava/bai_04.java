package day01_kieudulieutrongJava;


import java.util.Scanner;

public class bai_04 {
    public static void main(String[] args) {
        /**
         * Nhap vao ban phim can nang va chieu cao
         * tinh BMI va dua ra ket qua theo thang so sanh
         */

        // Import ham nhap gia tri tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Khai bao chieu cao
        System.out.println("Nhap chieu cao (m): ");
        float myHeight = scanner.nextFloat();

        // Khai bao can nang
        System.out.println("Nhap can nang (kg): ");
        float myWeight = scanner.nextFloat();

        // Cong thuc tinh BMI

        float myBMI = myWeight / (myHeight * myWeight);

        // In ra ket qua BMI
        System.out.println("Chi so BMI cua ban la: " + myBMI);

    }
}
