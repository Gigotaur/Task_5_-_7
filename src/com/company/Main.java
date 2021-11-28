package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double s = readNum("введите параметр размера: ");

        if (checkNum(s)) {
            System.out.println("loading figure...");
        } else {
            System.out.println("Error");
            return;
        }

        figure(s);

    }

    private static double readNum(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        double num;
        num = input.nextDouble();
        return num;

    }

    private static void figure(double s) {

        double sign = -1;
        double space =(s-1)/2;
        for (double stIv = 0; stIv !=s; stIv++) {

            for (double ndIv = 0; ndIv != space; ndIv++ ){
                System.out.print(" ");
            }

            sign +=2;

            for (double rdIv =0; rdIv !=sign; rdIv ++){
                System.out.print("*");
            }
            System.out.println();
            space --;
        }
    }

    private static boolean checkNum ( double s){
        return (s % 2 != 0);
    }

}