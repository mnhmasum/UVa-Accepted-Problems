package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12577_Hajj_e_Akbar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        
        int count = 0;
        
        while (scanner.hasNextLine()) {
            count ++;
            line = scanner.nextLine();
                
            if (line.contains("*")) {
                scanner.close();
                break;
            }

            if (line.equals("Hajj")) {
                System.out.println("Case " + count + ": " + "Hajj-e-Akbar");
            } else if (line.equals("Umrah")) {
                System.out.println("Case " + count + ": " +"Hajj-e-Asghar");
            } 
        }
    }
}
