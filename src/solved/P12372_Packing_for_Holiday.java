package solved;


import java.util.Scanner;

/**
 *
 * @author adaptive
 */
public class P12372_Packing_for_Holiday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input <= 100) {
            for (int i = 0; i < input; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                
                if (a > 20 || b > 20 || c > 20) {
                    System.out.println("Case " + (i + 1) + ": bad");
                } else {
                    System.out.println("Case " + (i + 1) + ": good");
                }

            }

        }

    }
}
