
import java.util.Arrays;
import java.util.IntSummaryStatistics;
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
        
        int x = 6392893;
        
        int secondDigit = (x/10)%10;
        System.out.println("Second Digit: " + secondDigit);
        
        int secondDigit1  =  (x % 100) / 10;
        System.out.println("Second Digit 1: " + secondDigit1);
        
        int LastDigit  =  (x % 10);
        System.out.println("Last Digit: " + LastDigit);
        
        int[] tab = new int[5];
        tab[0] = 3;
        tab[1] = 5;
        tab[2] = 1;
        
        IntSummaryStatistics stat = Arrays.stream(tab).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        
//        float one = (float) 419;
//        
//        float x1 = (float) (one/60f);
//        System.out.println("" + x1);
//        System.out.println("" + Math.ceil(x1));
//        
//        System.out.println("=>" + ((int) Math.ceil(x1)) * 15);
        
        int one =  419;
        
        int x1 = (one/60) + 1;
        System.out.println("" + x1);
        System.out.println("" + Math.ceil(x1));
        
        System.out.println("=>" + (x1*15));

    }
}
