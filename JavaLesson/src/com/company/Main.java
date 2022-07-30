package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) { // 2ga bo'lib qoldig'ini tekshirish
            System.out.println("juft");
        }

        if (n % 2 != 0) { // 2ga bo'lganda qoldig' 0 ga teng bo'lmasa
            System.out.println("toq");
        }

    }
}
