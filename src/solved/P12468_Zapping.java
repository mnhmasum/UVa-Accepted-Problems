package solved;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mnhmasum
 */
public class P12468_Zapping {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

  
        while (scanner.hasNextInt()) {

            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            if (input1 == -1 && input2 == -1) {
                scanner.close();
                break;
            }
            
            if (input1 == 0 && input2 == 99 || input1 == 99 && input2 == 0) {
                System.out.println("1");
            } else if (input1 == 99 && input2 == 99) {
                System.out.println("0");
            } else {
                int two = 0;
                
                if (input1 == 99) {
                    two = input1 + (99 - input2);
                } else {
                    two = input1 + (99 - input2) + 1;
                }
               
                if (two > input2 + (99 - input1) + 1) {
                    two = input2 + (99 - input1) + 1;
                }
                
                int one =  Math.abs((input1 - input2));
                
                if (two > one) {
                    System.out.println(one);
                } else {
                    System.out.println(two);
                }
                
                
            }

        }
       
    }
}
