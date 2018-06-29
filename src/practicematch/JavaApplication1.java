/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicematch;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adaptive
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO code application logic here
        for(int i =0; i < 10; i++) 
            System.out.println("" + i);
            System.out.println("Hello World");
            
            System.out.println("" + (0xbb & 0xff));
            
            new Runnable() {
                @Override
                public void run() {
                    System.out.println("HI thread");
                }
            };
           
        
        //System.out.println("" + bytes[0]);
    
      //ArrayCopy  
      int arr1[] = { 1, 2, 3, 4, 5, 6 };
      int arr2[] = { 0, 0, 0, 0, 0, 50, 60, 70, 80, 90 };
    
      // copies an array from the specified source array
      System.arraycopy(arr1, 0, arr2, 0, arr1.length);
      
      
      System.out.print("array2 = ");
      System.out.print(arr2[0] + " ");
      System.out.print(arr2[1] + " ");
      System.out.print(arr2[2] + " ");
      System.out.print(arr2[3] + " ");
      System.out.print(arr2[4] + " ");
      System.out.print(arr2[5] + " ");
      System.out.print(arr2[6] + " ");
      System.out.print(arr2[7] + " ");
      System.out.print(arr2[8] + " ");
      System.out.print(arr2[9] + " ");
      
      
      //Byte conversion
        String pass = "abcdefghijklmno";
        
        byte[] bytes = new byte[20];
        byte[] passBytes = pass.getBytes();
        
        System.arraycopy(passBytes, 0, bytes, 0, passBytes.length);
        
        bytes[15] = (byte) 1;
        bytes[16] = (byte) 10;
        int currentYear = 2018;
        bytes[17] = (byte) (currentYear - 2000);
        bytes[18] = 0x00;
        bytes[19] = (byte)Integer.parseInt("11000000", 2);
          
        System.out.println("c size" + bytes[19]);
        System.out.println(Integer.toBinaryString((bytes[19]+256) % 256));
                    
        
        //Pair count
        String mac = "001ec01d1094";
        
        int currentIndex = 0;
        
        int getPairCount = (mac.length() / 2);
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < getPairCount; i++) {
            builder.append(mac.substring(currentIndex, currentIndex + 2) + ":");
            currentIndex = currentIndex + 2;
        }
        
        System.out.println(builder.substring(0, builder.length() - 1).toUpperCase());
        
       //Date comparison
//       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//       
//       String valid_until = "6/2/2018";
//     
//       Date date = new Date();
//
//       
//        Date strDate;
//        Date cDate;
//        try {
//            strDate = sdf.parse(valid_until);
//            strDate =  sdf.parse(sdf.format(strDate));
//            cDate = sdf.parse(sdf.format(date));
//            
//            System.out.println("===" + cDate.compareTo(strDate));
//            
//            if (cDate.equals(strDate)) {
//                System.out.println("HI true");
//            } else {
//                System.out.println("Hi False");
//            }
//            
//            if (new Date().before(strDate)) {
//                //int catalog_outdated = 1;
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
//        } catch (ParseException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//         Date currentDate = new Date();
//        Calendar c = Calendar.getInstance();
//         //c.setTime(currentDate);
//         
//        c.add(Calendar.DATE, 9);
//        
//        bytes[15] = (byte) c.get(Calendar.DATE);
//        bytes[16] = (byte) (c.get(Calendar.MONTH) + 1); // Month start from 0 index
//
//        int currentYear1 = c.get(Calendar.YEAR);
//        
//        
//       System.out.println("Date: " + c.get(Calendar.DATE));
//       System.out.println("MOnth: " + (c.get(Calendar.MONTH) + 1));
//       System.out.println("YEAR: " + c.get(Calendar.YEAR));
//       
       Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        String valid_until = "2/3/2017";

        Date expiredDate;
        Date today;

        try {
            expiredDate = sdf.parse(valid_until);
            today = sdf.parse(sdf.format(date));

            System.out.println("===" + today.compareTo(expiredDate));

            if (today.compareTo(expiredDate) == 1) {
                
            }

        }  catch (java.text.ParseException e) {
            
        }
       
        
        StringBuilder str = new StringBuilder("Java Util* Package\"");
       System.out.println("string = " + str);
    
      // replace substring from index 5 to index 9
       str.replace(9, 10, "#####");
   
      // prints the StringBuilder after replacing
       System.out.println("After replacing: " + str);
      
    }
    
    
    public  boolean isCredentialExpired(String expireDate) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        String valid_until = expireDate;

        Date expiredDate;
        Date today;

        try {
            expiredDate = sdf.parse(valid_until);
            today = sdf.parse(sdf.format(date));

            System.out.println("===" + today.compareTo(expiredDate));

            if (today.compareTo(expiredDate) == 1) {
                return false;
            }

        }  catch (java.text.ParseException e) {
            return true;
        }

        return true;

    }
    
}
