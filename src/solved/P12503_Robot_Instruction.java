package solved;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
public class P12503_Robot_Instruction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
  
        for (int i = 0; i < input; i++) {
            
            int instructions = scanner.nextInt();
            scanner.nextLine();
            
            List<String> list1 = new ArrayList<>();
           
            int initPostion = 0;
            for (int j = 0; j < instructions; j++) {
                String a = scanner.nextLine();
                
                String[] x = a.split("\\s+");
                
                if (x.length > 1) {
                    int pos = Integer.parseInt(x[2]);
                    if (list1.get(pos - 1).equals("LEFT")) {
                        initPostion = initPostion -1;
                        list1.add("LEFT");
                    } else {
                        initPostion = initPostion + 1;
                        list1.add("RIGHT");
                    }
                } else {
                    if (a.equals("LEFT")) {
                        initPostion = initPostion -1;
                        list1.add(a);
                    } else {
                        initPostion = initPostion + 1;
                        list1.add(a);
                    }
                    
                }
               
            }
            
            System.out.println("" + initPostion);
        }

    }
}
