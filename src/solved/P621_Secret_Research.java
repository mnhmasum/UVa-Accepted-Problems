package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P621_Secret_Research {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        int inputCounter = 0;

        boolean isClose = false;

        while (!isClose && scanner.hasNextLine()) {

            for (int j = 0; j < testCaseCount; j++) {

                if (inputCounter > testCaseCount) {
                    scanner.close();
                    isClose = true;
                    break;
                }

                String s = scanner.nextLine();

                inputCounter++;

                if (s.length() > 2) {

                    String s1 = s.substring(s.length() - 2, s.length());

                    if (s1.equals("35")) {
                        System.out.println("-");
                        continue;
                    }

                    String sub = s.substring(0, 3);
                    if (sub.equals("190")) {
                        System.out.println("?");
                        continue;
                    }

                    String s2 = s.substring(0, 1);

                    if (s2.equals("9") && s.substring(s.length() - 1, s.length()).equals("4")) {
                        System.out.println("*");
                    }

                } else if (s.equals("1") || s.equals("4") || s.equals("78")) {
                    System.out.println("+");
                }
            }

        }

    }
}
