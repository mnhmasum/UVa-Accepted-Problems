
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adaptive
 */
public class TestMatch {

    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("1000000001", 2));
//
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        if (input <= 100) {
//            for (int i = 0; i < input; i++) {
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                int c = scanner.nextInt();
//
//                if (a > 20 || b > 20 || c > 20) {
//                    System.out.println("Case " + (i + 1) + ": bad");
//                } else {
//                    System.out.println("Case " + (i + 1) + ": good");
//                }
//
//            }
//
//        }

        String regex = "\\d+";

// positive test cases, should all be "true"
        System.out.println("1".matches(regex));
        System.out.println("12345".matches(regex));
        System.out.println("123456789".matches(regex));


        Pattern pp = Pattern.compile("\\d+");
        Matcher m = pp.matcher("sdfsdf123sdfs3464ew111");
        
        while(m.find())
        {
            System.out.println(m.group());
            break;
        }

    }
}
