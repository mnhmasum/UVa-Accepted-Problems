package solved;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mnhmasum
 */
public class P12403_Save_Shetu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int inputCounter = 0;
        int totalAmount = 0;

        if (input <= 100 && input >= 1) {

            while (scanner.hasNextLine()) {

                String a = scanner.nextLine();
                int amount = 0;

                // System.out.println("" + amount);
                if (a.contains("donate")) {
                    Pattern pp = Pattern.compile("\\d+");
                    Matcher m = pp.matcher(a);

                    while (m.find()) {
                        amount = Integer.parseInt(m.group());
                        break;
                    }

                    totalAmount = totalAmount + amount;

                } else if (a.contains("report")) {
                    System.out.println(totalAmount);
                }

                if (input == inputCounter) {
                    scanner.close();
                    break;
                }

                inputCounter++;

            }

        }

    }
}
