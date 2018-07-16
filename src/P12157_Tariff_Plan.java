import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12157_Tariff_Plan {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int j = 0; j < input; j++) {
            int callTimes = scanner.nextInt();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < callTimes; i++) {
                int durationInSeconds = scanner.nextInt();
                list.add(durationInSeconds);
            }

            System.out.println("Case " + (j + 1) + ": " + performLogic(list));

        }


    }

    public static String performLogic(List<Integer> durationInSeconds) {
        int totalAmount = 0;
        int totalJuiceAmount = 0;

        for (int i = 0; i < durationInSeconds.size(); i++) {

            int seconds =  durationInSeconds.get(i);

            int t = (seconds / 30) + 1;

            int amount = t * 10;

            totalAmount = totalAmount + amount;
        }

        for (int i = 0; i < durationInSeconds.size(); i++) {

            int seconds = durationInSeconds.get(i);

            int t = (seconds / 60) + 1;

            int amount = t * 15;
            
            totalJuiceAmount = totalJuiceAmount + amount;
        }

        String msg = "";

        if (totalAmount < totalJuiceAmount) {
            msg = "Mile " + totalAmount;

        } else if (totalAmount == totalJuiceAmount) {
            msg = "Mile Juice " + totalAmount;

        } else {
            msg = "Juice " + totalJuiceAmount;
        }

        return msg;

    }

}
