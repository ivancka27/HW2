package com.samsung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(c + " " + b + " " + a);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
