package org.example.module.main;

import org.example.module.firsttasksolution.ArrayOfNumbers;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [100];
        ArrayOfNumbers.arrayMaker(array);
        System.out.println(ArrayOfNumbers.countOfUniqueNumbers(array));
    }
}
