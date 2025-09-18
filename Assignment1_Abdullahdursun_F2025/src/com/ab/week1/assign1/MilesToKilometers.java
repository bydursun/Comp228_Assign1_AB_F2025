package com.ab.week1.assign1;

import java.util.Scanner;

public class MilesToKilometers {
    public void convertAndPrint(Scanner sc) {
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.printf("%.2f miles is %.2f kilometers.%n", miles, kilometers);
    }
}