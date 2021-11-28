package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        int s = readNum("введите параметр размера: ");

        if (checkNum(s)) {
            System.out.println("loading figure...");
        } else {
            System.out.println("Error");
            return;
        }

        figure(s);

    }

    private static int readNum(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        return num;

    }

    private static void figure(int s) {

        double sign = -1;
        double space = (s-1)/2;

        for (double stIv = 0; stIv <= s/2; stIv++) {
            for (double ndIv = 0; ndIv < space; ndIv++ ){
                System.out.print(" ");
            }

            sign += 2;

            for (double rdIv = 0; rdIv < sign; rdIv++){
                System.out.print("*");
            }
            System.out.println();

            space--;
        }

        space += 2;

        for (double stIv = s/2; stIv>0; stIv--) {
            for (double ndIv = 0; ndIv < space; ndIv++ ){
                System.out.print(" ");
            }

            sign -= 2;

            for (double rdIv=0; rdIv<sign; rdIv++){
                System.out.print("*");
            }
            System.out.println();

            space++;
        }
    }

    private static boolean checkNum ( int s){
        return (s % 2 != 0);
    }

}
