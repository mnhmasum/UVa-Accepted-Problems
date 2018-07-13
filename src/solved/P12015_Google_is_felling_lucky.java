package solved;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mnhmasum
 */
public class P12015_Google_is_felling_lucky {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        scanner.nextLine();

        if (input <= 100 && input >= 1) {

            for (int i = 0; i < input; i++) {

                List<String> list = new ArrayList<>();
                for (int j = 0; i < 10; j++) {
                    String a = scanner.nextLine();
                    list.add(a);
                    if (j == 9) {
                        break;
                    }

                }
                
                System.out.println("Case #" + (i+1) + ":");
                getLuckyList(list);

            }

        }

    }

    public static void getLuckyList(List<String> list) {

        List<String> list1 = new ArrayList<>();

        String[] x = list.get(0).split("\\s+");

        int max = Integer.parseInt(x[1]);
        
        list1.add(list.get(0));

        for (int i = 0; i < list.size(); i++) {

            String x1 = list.get(i).split("\\s+")[1];
            int amount1 = Integer.parseInt(x1);

            if (amount1 > max) {
                list1.clear();
                max = amount1;
                list1.add(list.get(i));
                
            } else if (amount1 == max) {
                max = amount1;
                list1.add(list.get(i));
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).split("\\s+")[0]);
        }

    }
}
