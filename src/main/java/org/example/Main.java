package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        Experiment exp = new Experiment();

        while (true) {
            System.out.print("(10, 100, 1000,0)");
            int size = scanner.nextInt();

            if (size == 0) {
                System.out.println("end");
                break;
            }


            int[] currentArray = sorter.generateRandomArray(size);
            System.out.println(size + " element");

            boolean arrayMenu = true;
            while (arrayMenu) {
                System.out.println("1.(Selection Sort)");
                System.out.println("2.(Merge Sort)");
                System.out.println("3.(Binary Search)");
                System.out.println("0");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        long basicTime = exp.measureBasicSort(currentArray);
                        System.out.println(" time Basic Sorting: " + basicTime + " ns");
                        break;
                    case 2:
                        long advTime = exp.measureAdvancedSort(currentArray);
                        System.out.println("time Advanced Sorting: " + advTime + " ns");
                        break;
                    case 3:
                        System.out.print("Search element");
                        int target = scanner.nextInt();
                        long searchTime = exp.measureSearch(currentArray, target);
                        System.out.println("time Binary Search: " + searchTime + " ns");
                        break;
                    case 0:
                        arrayMenu = false;
                        break;
                    default:
                        System.out.println("again");
                }
            }
           }
        scanner.close();
    }
}