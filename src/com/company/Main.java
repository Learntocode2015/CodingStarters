package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    // avoid globals - 1 gb - call stack and heap - takes variable from heap

    public static void main(String[] args) {
        int chickenNum = HowManyChickens();
        int YearlyTotal = YearlyAverage(chickenNum);
        System.out.println(YearlyTotal);
    }

    public static int HowManyChickens(){
        System.out.println("how many chickens?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int random() {
        Random rand = new Random();
        return rand.nextInt(4) + 26;
    }

    public static int YearlyAverage(int chickenNum) {
        int runningTotal = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < chickenNum; j++) {
                runningTotal += random();
            }
        }
        return runningTotal;
    }

}


