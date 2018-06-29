package solved;


import java.util.Scanner;
/**
 *
 * @author mnhmasum
 */
public class P11547_Automatic_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input <= 100 && input >= 1) {
            for (int i = 0; i < input; i++) {
            
                int a = scanner.nextInt();
                if (a >= -1000 && a <= 1000) {
                    int val = ((((((a * 567) / 9) + 7492)*235) / 47) - 198) ;
                    val =  (val % 100) / 10;
                    System.out.println(Math.abs(val));
            
                }
              
            }
        }
    }
}
