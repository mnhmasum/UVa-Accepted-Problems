package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P11727_CostCutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 20) {
            for (int i = 0; i < input; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                
                if (a > b && a < c || a < b && a > c) {
                    System.out.println("Case " + (i+1) + ": " + a);
                } else if (b > a && b < c || b < a && b > c) {
                    System.out.println("Case " + (i+1) + ": "  + b);
                } else if (c > a && c < b || c<a && c > b) {
                    System.out.println("Case " + (i+1) + ": "  + c);
                }
            }
        }
    }
}
