package com.samsung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a / 10 == 0 && a >= 0) {
            System.out.println("DIGIT");
        } else if (a / 100 == 0 && a / 10 != 0 && a > 0) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
