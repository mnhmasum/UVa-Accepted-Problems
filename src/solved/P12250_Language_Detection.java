package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12250_Language_Detection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        
        int count = 0;
        
        while (scanner.hasNextLine()) {
            count ++;
            line = scanner.nextLine();
                
            if (line.contains("#") || line.length() > 14) {
                scanner.close();
                break;
            }

            if (line.equals("HELLO")) {
                System.out.println("Case " + count + ": " + "ENGLISH");
            } else if (line.equals("HOLA")) {
                System.out.println("Case " + count + ": " +"SPANISH");
            } else if (line.equals("HALLO")) {
                System.out.println("Case " + count + ": " +"GERMAN");
            } else if (line.equals("BONJOUR")) {
                System.out.println("Case " + count + ": " +"FRENCH");
            } else if (line.equals("CIAO")) {
                System.out.println("Case " + count + ": " +"ITALIAN");
            } else if (line.equals("ZDRAVSTVUJTE")) {
                System.out.println("Case " + count + ": " +"RUSSIAN");
            } else {
                 System.out.println("Case " + count + ": " +"UNKNOWN");
            }
        }
    }
}
