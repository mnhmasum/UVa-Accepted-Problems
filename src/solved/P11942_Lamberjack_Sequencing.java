package solved;


import java.util.Scanner;
/**
 *
 * @author adaptive
 */
public class P11942_Lamberjack_Sequencing {

    public static void main(String[] args) {
        System.out.println("Lumberjacks:");
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        if (testCase < 20) {
            for (int i = 0; i < testCase; i++) {
                
                int[] arr = new int[10]; 
                for (int j = 0; j < 10; j++) {
                    int speed = scanner.nextInt();
                  
                    arr[j] = speed;
                }
                
                if (isAscOrder(arr)) {
                    System.out.println("Ordered");
                    continue;
                } 
                
                if (isDscOrder(arr)) {
                    System.out.println("Ordered");
                    continue;
                }
                
                System.out.println("Unordered");
            }
        }
    }
    
    
    public static boolean isAscOrder(int[] arr) {
      
        boolean isTrue = false;
        
        int max = arr[0];
      
        for (int i = 0; i < arr.length; i++) {
            
            if (i == 9) {
                break;
            }
            
            if (max < arr[i + 1]) {
                isTrue = true;
                max = arr[i + 1];
            } else {
                isTrue = false;
                break;
                
            }  
        }
        
      return isTrue;
    }
    
     public static boolean isDscOrder(int[] arr) {
      
        boolean isTrue = false;
        
        int max = arr[0];
      
        for (int i = 0; i < arr.length; i++) {
            
            if (i == 9) {
                break;
            }
            
            if (max > arr[i + 1]) {
                isTrue = true;
                max = arr[i + 1]; 
            } else {
                isTrue = false;
                break;
                
            }  
        }
        
      return isTrue;
    }
    
}
