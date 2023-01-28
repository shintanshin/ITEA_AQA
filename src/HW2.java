import java.util.Scanner;

public class HW2 {
    public static int sumOf(int a) {
        int x = a / 100;
        int y = a % 100 / 10;
        int z = a % 10;
        int sum = x + y + z;
        return sum;
    }
    public static int sumOf(String v1, String v2) {
        String a = v1;
        String b = v2;
        int z = a.length() + b.length();
        return z;
    }
    public static boolean sumOf(short i) {
        boolean comp = i > 0;
        return comp;
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number");
        short num = i.nextShort();
        int overLoud = sumOf("Ukraine", "Country");
        int overLoud1 = sumOf(367);
        boolean overLoud2 = sumOf(num);

        System.out.println(overLoud);
        System.out.println(overLoud1);
        if (overLoud2) {
            System.out.println("Number is greater than 0");
        } else {
            System.out.println("Number is lower or equal 0");
        }
    }
}