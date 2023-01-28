import java.util.Scanner;
public class Main {
    public static void sumOfNumbers(int a, int b) {
        int c = a + b;
        System.out.println("Result:\n"+c);
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter num1:");

        int num1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Enter num2:");

        int num2 = b.nextInt();
        sumOfNumbers(num1, num2);
    }

}