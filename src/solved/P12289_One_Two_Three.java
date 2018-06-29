package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12289_One_Two_Three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        
        int inputCounter = 0;

        while (scanner.hasNextLine()) {

            String wordInput = scanner.nextLine();
            
            if (wordInput.length() <= 14) {

                if (wordInput.length() == 3) {
                    if (wordInput.contains("o") && wordInput.contains("e")
                            || wordInput.contains("o") && wordInput.contains("n")
                            || wordInput.contains("n") && wordInput.contains("e")) {
                        System.out.println("1");
                    } else {
                        System.out.println("2");
                    }
                } else if (wordInput.length() == 5) {
                    System.out.println("3");
                }

                if (testCaseCount == inputCounter) {
                    scanner.close();
                    break;
                }

                inputCounter++;
            }

        }
    }
}
