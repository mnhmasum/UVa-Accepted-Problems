package solved;


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P11498_Division_of_Nlogonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            if (input == 0) {
                scanner.close();
                break;
            }
            
            int divisionPointX = scanner.nextInt();
            int divisionPointY = scanner.nextInt();
            
            for (int j = 0; j < input; j++) {
                int regionPointX = scanner.nextInt();
                int regionPointY = scanner.nextInt();
                
                if (regionPointX > divisionPointX && regionPointY > divisionPointY) {
                    System.out.println("NE");
                } else if (regionPointX > divisionPointX && regionPointY < divisionPointY) {
                    System.out.println("SE");
                } else if (regionPointX < divisionPointX && regionPointY > divisionPointY) {
                    System.out.println("NO");
                } else if (regionPointX < divisionPointX && regionPointY < divisionPointY) {
                    System.out.println("SO");
                } else if (regionPointX == divisionPointX || regionPointY == divisionPointY) {
                    System.out.println("divisa");
                }

            }

        }

    }
}
