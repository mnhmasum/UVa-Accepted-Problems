
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12157_Tariff_Plan {

    public static void main(String[] args) {
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
            if (durationInSeconds.get(i) >= 1 && durationInSeconds.get(i) <= 29) {
                totalAmount = totalAmount + 10;
            } else if (durationInSeconds.get(i) >= 30 && durationInSeconds.get(i) <= 59) {
                totalAmount = totalAmount + 20;
            } else if (durationInSeconds.get(i) >= 60) {
                int t = (durationInSeconds.get(i) / 59);
                
                t = t*30;
                
                totalAmount = totalAmount + t;
            } 
        }
            
        //System.out.println("mile=>" + totalAmount );
        
        for (int i = 0; i < durationInSeconds.size(); i++) {
            if (durationInSeconds.get(i) >= 1 && durationInSeconds.get(i) <= 59) {
                totalJuiceAmount = totalJuiceAmount + 15;
            } else if (durationInSeconds.get(i) > 59 && durationInSeconds.get(i) <= 119) {
                totalJuiceAmount = totalJuiceAmount + 30;
            
            }  else if (durationInSeconds.get(i) > 59) {
                int t = (durationInSeconds.get(i) / 59);
                
                t = t*15;
                totalJuiceAmount = totalJuiceAmount + t;
            }
        }
        
        //System.out.println("jiuce=>" + totalJuiceAmount);

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
