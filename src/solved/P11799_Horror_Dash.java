package solved;


import java.util.Scanner;

/**
 *
 * @author adaptive
 */
public class P11799_Horror_Dash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        if (testCase <= 100) {
            for (int i = 0; i < testCase; i++) {
                int students = scanner.nextInt();

                int minimumSpeed = 0;
                for (int j = 0; j < students; j++) {
                    int speed = scanner.nextInt();
                    if (speed > minimumSpeed) {
                        minimumSpeed = speed;
                    }

                }

                System.out.println("Case " + (i + 1) + ": " + minimumSpeed);

            }
        }
    }
}
