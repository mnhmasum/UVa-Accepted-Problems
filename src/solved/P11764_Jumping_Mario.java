package solved;

import java.util.Scanner;
/**
 *
 * @author adaptive
 */
public class P11764_Jumping_Mario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 30) {
            for (int i = 0; i < input; i++) {
                int walls = scanner.nextInt();

                int previousWallSize = 0;

                int high = 0;
                int low = 0;

                for (int j = 0; j < walls; j++) {
                    int wallSize = scanner.nextInt();

                    if (walls == 1) {
                        high = 0;
                        low = 0;
                        continue;
                    }

                    if (j > 0) {
                        if (wallSize > previousWallSize) {
                            high++;
                        } else if (wallSize < previousWallSize) {
                            low++;
                        }

                    } else {
                        previousWallSize = wallSize;
                        continue;
                    }

                    previousWallSize = wallSize;

                }

                System.out.println("Case " + (i + 1) + ": " + high + " " + low);

            }
        }
    }
}
