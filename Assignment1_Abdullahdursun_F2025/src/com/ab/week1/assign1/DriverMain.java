package com.ab.week1.assign1;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeCalculation gradeCalc = new GradeCalculation();
        MilesToKilometers milesToKm = new MilesToKilometers();
        LitersToGallons litersToGal = new LitersToGallons();
        CadToUsd cadToUsd = new CadToUsd();

        boolean running = true;
        while (running) {
            System.out.println("\n=== COMP228 Assignment 1 Menu ===");
            System.out.println("1) Calculate course letter grade");
            System.out.println("2) Miles to Kilometers");
            System.out.println("3) Liters to Gallons");
            System.out.println("4) CAD to USD");
            System.out.println("5) Exit");
            System.out.print("Choose an option (1-5): ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number 1-5.");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    gradeCalc.calculateAndPrint(sc);
                    break;
                case 2:
                    milesToKm.convertAndPrint(sc);
                    break;
                case 3:
                    litersToGal.convertAndPrint(sc);
                    break;
                case 4:
                    cadToUsd.convertAndPrint(sc);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Choose a number 1-5.");
                    break;
            }
        }
        sc.close();
    }
}