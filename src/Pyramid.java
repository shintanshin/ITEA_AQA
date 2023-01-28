public class Pyramid {
    public static void main(String[] args){
        int w = 6;
        System.out.println("Full pyramid\n");
        for(int i =1; i<=w; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for(int k=w -1; k>0; k--){
            for (int c = 1; c<=k; c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Left side of the pyramid\n");
        for(int a =1; a<=w; a++) {
            for (int b = 1; b <= w -a ; b++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= a; d++) {
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Left side of the upside down pyramid\n");
        for(int m =0; m<=w; m++) {
            for (int l = 1; l <= m ; l++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= w-m; p++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
