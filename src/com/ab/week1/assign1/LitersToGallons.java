package com.ab.week1.assign1;

import java.util.Scanner;

public class LitersToGallons {
    public void convertAndPrint(Scanner sc) {
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        double gallons = liters * 0.264172;
        System.out.printf("%.2f liters is %.2f gallons.%n", liters, gallons);
    }
}