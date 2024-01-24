package Day03_toantugan;

import java.util.Scanner;

public class bai_02 {
    public static void main(String[] args) {
        System.out.println("Moi nhap ban kinh: ");

        //Scanner

        double r = new Scanner(System.in).nextDouble();

        // Tinh chu vi

        double chuvi = 2 * r * Math.PI;
        System.out.println("chu vi duong tron la: " + (double) Math.round(chuvi * 100) / 100);

        // Tinh dien tich

        double dientich = Math.pow(r, 2) * Math.PI;
        System.out.println("dien tich duong tron la: " + (double) Math.round(dientich * 100) / 100);

        /** Tinh chu vi - dien tich hinh chu nhat*/


        // Nhap chieu dai

        System.out.println("nhap vao chieu dai: ");
        double chieudai = new Scanner(System.in).nextDouble();

        //Nhap chieu rong

        System.out.println("nhap vao chieu rong: ");
        double chieurong = new Scanner(System.in).nextDouble();

        // Tinh chu vi

        double pchunhat = (chieudai + chieurong);
        System.out.println("Chu vi hinfh chu nhat la: " + (double) Math.round(pchunhat * 100) / 100);

        // Tinh dien tich

        double schunhat = chieudai * chieurong;
        System.out.println("Chu vi hinh chu nhat la: " + (double) Math.round(schunhat * 100) / 100);
    }
}
