package day02_operators;

public class bai_02 {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        float d1 = 2.0f;
        float d2 = 5.0f;
        float d3 = -0.5f;

        System.out.println("ket qua i1 + (i2*i3) la: " + (i1 + (i2*i3)));
        System.out.println("ket qua i1*(i2+i3) la: " + (i1*(i2+i3)));
        System.out.println("ket qua i1/(i2+i3) la: " + (i1/(i2+i3)));

        float x = (float)i1/i2;
        float y = x + (float) i3;
        System.out.println("ket qua i1/i2+i3 la: " + (x+y));

        int x1 = 3, x2 = 4, x3 = 5;
        float y1 = x1 + x2 + (float)x3/x1;
        float y2 = (float) (x1+x2+x3)/3;
        System.out.println("ket qua cua 3+4+5/3 la: " + y1);
        System.out.println("ket qua cua (3+4+5)/3 la: " + y2);

        System.out.println("ket qua cua d1+(d2*d3) la: " + (d1+(d2*d3)));
        System.out.println("ket qua cua d1+d2*d3 la: " + (d1+d2*d3));

        float z1 = d1/d2;
        float z2 = z1 - d3;
        System.out.println("ket qua cua d1/d2-d3 la: " + z2);
        System.out.println("ket qua cua d1/(d2-d3) la: " + (d1/(d2-d3)));
        System.out.println("ket qua cua d1+d2+d3/3) la: " + (d1+d2+(d3/x1)));
        System.out.println("ket qua cua (d1+d2+d3)/3 la: " + ((d1+d2+d3)/x1));
        System.out.println("ket qua cua d1+d2+(d3/3) la: " + ((d1+d2)+(d3/x1)));
        System.out.println("ket qua cua 3*(d1+d2)*(d1-d3) la: " + (x1*(d1+d2)*(d1-d3)));
    }
}
