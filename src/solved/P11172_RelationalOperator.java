package solved;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mnhmasum
 */
class P11172_RelationalOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 15) {
            for (int i = 0; i < input; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a > b) {
                    System.out.println(">");
                } else if (a < b) {
                    System.out.println("<");
                } else if (b == a) {
                    System.out.println("=");
                } else {
                    System.out.println("999999999");
                }

            }
        }

    }

}
