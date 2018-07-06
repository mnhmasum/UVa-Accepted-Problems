package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P11332_Summing_Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String wordInput = scanner.nextLine();

            if (wordInput.equals("0")) {
                scanner.close();
                break;
            }

            int total = 0;

            for (int i = 0; i < wordInput.length(); i++) {
                int v = Character.getNumericValue(wordInput.charAt(i));
                total = total + v;

            }
            
            int total2 = 0;
            String input2 = String.valueOf(total);
            for (int j = 0; j < input2.length(); j++) {
                int v = Character.getNumericValue(input2.charAt(j));
                total2 = total2 + v;
                
            }
            
            int total3 = 0;
            String input3 = String.valueOf(total2);
            for (int j = 0; j < input3.length(); j++) {
                int v = Character.getNumericValue(input3.charAt(j));
                total3 = total3 + v;
                
            }
            
            System.out.println("" + total3);

        }

    }

}
