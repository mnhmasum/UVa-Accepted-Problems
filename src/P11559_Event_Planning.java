
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mnhmasum
 */
public class P11559_Event_Planning {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            
            int p = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();
            int w = scanner.nextInt();

            int costAmount = 0;
            
             List l = new ArrayList();

            for (int j = 0; j < h; j++) {
                 boolean isValidHotel = true;
                 
                
                int singleManCost = scanner.nextInt();

                for (int k = 0; k < w; k++) {
                    int bed = scanner.nextInt();
                    if (p > bed || bed == 0) {
                        isValidHotel = false;
                        //System.out.println("hi");
                    }
                }

                if (isValidHotel) {
                    costAmount = p * singleManCost;
                    System.out.println("mul" + costAmount);
                    if (costAmount <= b) {
                        l.add(costAmount);
                    }
     
                }

            }
            
            if (l.isEmpty()) {
                System.out.println("stay home");
            } else {
                System.out.println(Collections.min(l));
            }
            
            

        }
    }
}
