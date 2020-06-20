package org.example.module.main;

import org.example.module.firsttasksolution.ArrayOfNumbers;
import org.example.module.thirdtasksolution.AreaOfTriangle;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [100];
        ArrayOfNumbers.arrayMaker(array);
        System.out.println(ArrayOfNumbers.countOfUniqueNumbers(array));

        System.out.println("\n================================\n");

        System.out.println(AreaOfTriangle.areaCalculation(17.0, 3.0, 4.0, 2.0, 1.0, 14.0));

    }
}
