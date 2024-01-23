package day01_kieudulieutrongJava;

public class bai_02 {

    /**
     * Khai bao mot so nguyen va kiem tra xem do la so chan hay so le
     */

    public static void main(String[] args) {
       // Declare variable
        int myNumber = 10;

        // Using boolean to check condition even: TRUE
        boolean isEven = (myNumber % 2 == 0);

        // Print result
        if (isEven) {
            System.out.println(myNumber + " La so chan");

        } else {
            System.out.println(myNumber + " La so le");
        }
    }
}
