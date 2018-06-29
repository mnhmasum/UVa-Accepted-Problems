package solved;




import java.util.Scanner;


class P272_Text_Quotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        boolean isStartingQuote = true;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '\u001a') 
                {
                    break;
                }

                if (line.charAt(i) == '\"') {
                    if (isStartingQuote == true) {
                        System.out.print("``");
                        isStartingQuote = false;
                        continue;
                    } else {
                        System.out.print("''");
                        isStartingQuote = true;
                        continue;
                    }
                }
                
                System.out.print(line.charAt(i));
            }
            
            System.out.print("\n");
        }

    }

}
