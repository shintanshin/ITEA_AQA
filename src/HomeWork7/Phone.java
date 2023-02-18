package HomeWork7;

import java.util.regex.*;
import java.util.Scanner;

public class Phone {
    public static String input() {
        Scanner j = new Scanner(System.in);
        System.out.println("Phone number:");
        return j.nextLine();
    }

    public static void checkNum(String num) {
        String template = "^[+](380)\\d{9}$";
        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(num);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Success");
        } else {
            System.out.println("Incorrect format/international code");
        }
    }

    public static void main(String[] args) {
        checkNum(input());
    }
}