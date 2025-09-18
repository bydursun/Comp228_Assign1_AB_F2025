package com.ab.week1.assign1;

import java.util.Scanner;

public class CadToUsd {
    
    private static final double EXCHANGE_RATE = 0.74;

    public void convertAndPrint(Scanner sc) {
        System.out.print("Enter CAD amount: ");
        double cad = sc.nextDouble();
        double usd = cad * EXCHANGE_RATE;
        System.out.printf("%.2f CAD is %.2f USD (Rate: %.2f)%n", cad, usd, EXCHANGE_RATE);
    }
}