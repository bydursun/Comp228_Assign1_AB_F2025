package com.ab.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {
    public void calculateAndPrint(Scanner sc) {
        System.out.print("Enter your course percentage: ");
        double score = sc.nextDouble();
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade: " + grade);
    }
}