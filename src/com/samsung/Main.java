package com.samsung;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = -b / a;
        double e = -c;
        String d = new DecimalFormat("#0.0").format(c);
        String f = new DecimalFormat("#0.0").format(e);
        if (a == 0 && b <= 0 || a < 0 && c < 0) {
            System.out.println("no such x");
        } else if (a > 0 && c < 0 || a == 0 && b > 0) {
            System.out.println("any x");
        } else if (a < 0 && c > 0) {
            System.out.println(f + "<x<" + d);
        }else if (a > 0 && c > 0) {
            System.out.println("x<" + f + " or x>" + d);
        }
    }
}
