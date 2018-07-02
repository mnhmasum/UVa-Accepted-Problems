package solved;

import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12279_Emoogle_Balance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = 0;
        while (scanner.hasNextInt()) {

            int input = scanner.nextInt();

            if (input == 0) {
                scanner.close();
                break;
            }

            inputCount++;

            int countTreated = 0;

            for (int j = 0; j < input; j++) {
                int event = scanner.nextInt();

                if (event == 0) {
                    countTreated++;
                }
            }

            input = (input - countTreated) - countTreated;

            System.out.println("Case " + inputCount + ": " + input);
        }
    }
}
