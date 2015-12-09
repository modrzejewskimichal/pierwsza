package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, n;
        System.out.println("Prosze podac liczbę");
        Scanner Kw = new Scanner(System.in);
        n = Kw.nextInt();
        Kw.close();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                a += i;
                i = a;
                if (i == n) {
                    System.out.println("podana liczba jest liczbą pierwszą");
                }
            }
        }
    }
    // write your code here
}