/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adaptive
 */
public class NewClass {

    public static void main(String[] args) {
    
        //System.out.println(Integer.toBinaryString(x));
        int b = Integer.parseInt("01100111", 2);

//        int i = Integer.parseInt("2f", 16);
//        String bin = Integer.toBinaryString(i);
//        System.out.println("=>" + bin);

        b = b >> 5;

        System.out.println(Integer.toBinaryString(b));

        System.out.println("=====> " + b);
        
        
        int date = 30;
        
        System.out.println("Day " + Integer.toBinaryString(date));
        
        int month = 11;
        int year = 2216;
        System.out.println(Integer.toBinaryString(month));
        System.out.println("Full Year Binary " +   Integer.toBinaryString(year));
        
        
        System.out.println("2nd Part " + Integer.toBinaryString(year & 0xff));
        
        System.out.println("1st Part " + Integer.toBinaryString(year >> 8));
        
        
        //At first month left shif 4 bit then year 8 bit right shift then add with month
        System.out.println("Made month bytes " +  Integer.toBinaryString((month << 4 | (year >> 8))));
        
        //Just remove year from month bytes
        System.out.println("Real Month: " + ((month << 4 | (year >> 8)) >> 4));
        
       
        int on = ((year >> 8) << 8) | (year & 0xff);
        
        System.out.println( Integer.toBinaryString(on));
        System.out.println("Real Year: " + on);
        System.out.println("------------------");
        
        int m = 103;
        year = 236;
        System.out.println("year " + Integer.toBinaryString(year));
        System.out.println("mo " + Integer.toBinaryString(m));
        System.out.println("month " + (m >> 4));
        
        System.out.println("Year 1st part " + Integer.toBinaryString((m & 0xf) << 8 | year ));
        //System.out.println(m >> 4);
        //System.out.println(m << 4);
        //System.out.println(Integer.toBinaryString(m << 4));
        System.out.println(Integer.toBinaryString(m & 0xff << 4));
        year = (m << 8) | (year & 0xff);
        System.out.println(Integer.toBinaryString(year));
        System.out.println(year);
        
    }
}
