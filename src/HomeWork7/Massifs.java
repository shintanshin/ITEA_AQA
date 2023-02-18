package HomeWork7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Massifs {

    public static int input() {
        Scanner j = new Scanner(System.in);
        System.out.println("Input:");
        return j.nextInt();
    }

    public static void divisionOfArray(int[] arr, int divisor) {
        int[] tempArray = new int[arr.length];
        int i = 0;

        for (Integer num : arr) {
            tempArray[i] = num / divisor;
            i++;
        }
        System.out.println(Arrays.toString(tempArray));
    }

    public static void main(String[] args) {
        try {
            int[] array = {5, 11, 7, 20};
            divisionOfArray(array, input());
        } catch (InputMismatchException e) {
            System.out.println("Houston, we have a problem - non digit symbol");
        } catch (ArithmeticException e) {
            System.out.println("Houston, we have a problem - division on 0");
        }
        System.out.println("Need more chocolate");
    }
}