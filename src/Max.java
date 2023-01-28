public class Max {
    public static void maxLength(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        if (a > b && a > c) {
            System.out.println("result:\n" + s1);
        } else if (b > a && b > c) {
            System.out.println("result:\n" + s2);
        } else if (c > a && c > b) {
            System.out.println("result:\n" + s3);
        } else {
            System.out.println("result:\n" + "There are no the max-length word");
        }
    }
    public static void main(String[] args) {
        maxLength("Дали","Горячу","Воду");
    }
}