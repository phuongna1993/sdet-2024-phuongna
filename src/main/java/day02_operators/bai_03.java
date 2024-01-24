package day02_operators;

import org.example.Main;

public class bai_03 {
    public static void main(String[] args) {
        /**
         * Quý khách có tiền vốn là 2 tỷ đồng
         * gửi tiết kiệm ngân hàng với lãi suất 7.9%/năm.
         * Sau 10 năm, tổng số tiền cả gốc lẫn lãi nhận được là bao nhiêu?
         * Gửi lãi đơn
         * Gửi lãi kép
         */
        // Khai bao hang so = so tien ban dau
        float laiSuat = 0.079f;
        final int NUMBER_OF_YEAR = 10;
        final int TIEN_GOC = 2;

        // CT tinh lai don A = P*r*n
        // CT tinh lai kep A = P(1+r)^n
        // P: Tien goc
        // r: % lai
        // n: Chu ky
        //Math.pow((1+r),n)

        float tienLaidon = TIEN_GOC*laiSuat*NUMBER_OF_YEAR;
        float tongTien1 = TIEN_GOC + tienLaidon;
        double p = Math.pow((1+laiSuat),NUMBER_OF_YEAR)*TIEN_GOC;

        System.out.println("Tong tien thu ve sau 10 nam neu tinh lai don: " + tongTien1 + "ty");
        System.out.println("Tong tien thu ve sau 10 nam neu tinh lai kep: " + (double) Math.round(p*100)/100 + "ty");


    }
}
