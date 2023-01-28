import java.util.Scanner;
public class HW2 {
    public static int sumOf(int a) {
        int x = a / 100;
        int y = a % 100 / 10;
        int z = a % 10;
        int sum = x + y + z;
        System.out.println("Sum of three digits: "+sum);
        System.out.println();
        return sum;
    }
    public static int sumOf(String v1, String v2) {
        String a = v1;
        String b = v2;
        int z = a.length() + b.length();
        System.out.println("Sum of two words: "+z);
        System.out.println();
        return z;
    }
    public static boolean sumOf(short i) {
        if (i>0) {
            System.out.println("Number is greater than 0");
            return true;
        }
        else {
            System.out.println("Number is lower or equal 0");
            return false;
        }
    }
    public static short input() {
        Scanner j = new Scanner(System.in);
        System.out.println("Enter the number");
        return  j.nextShort();
    }
    public static void main(String[] args) {
        sumOf(547);
        sumOf("Ukraine", "Country");
        sumOf(input());
    }
}