package com.samsung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 10;
        int c = a % 100;
        if ((c <= 10 || c >= 20) && b == 1) {
            System.out.println(a + " TORT");
        } else if ((c <= 10 || c >= 20) && (b == 2 || b == 3 || b == 4)) {
            System.out.println(a + " TORTA");
        } else {
            System.out.println(a + " TORTOV");
        }
    }
}
