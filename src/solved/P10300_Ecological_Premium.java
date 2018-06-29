package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P10300_Ecological_Premium {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 20) {

            for (int j = 0; j < input; j++) {
                int totalFarmer = scanner.nextInt();

                if (totalFarmer < 20) {
                    int totalCal = 0;
                    for (int i = 0; i < totalFarmer; i++) {

                        int yard = scanner.nextInt();
                        int ownsAnimalAmount = scanner.nextInt();
                        int expenses = scanner.nextInt();

                        int premiumPerFarmer = yard * expenses;
                        totalCal = totalCal + premiumPerFarmer;
                    }
                    
                    System.out.println(totalCal);

                }
            }

        }
    }
}
