package org.example.module.firsttasksolution;

public class ArrayOfNumbers {

    public static int [] arrayMaker(int [] array) {

        int max = 100;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    public static int countOfUniqueNumbers(int [] numbersArray) {
        int countAll = 0;
        int countRepeating = 0;
        int countUnique;

        for(int i = 0; i < numbersArray.length; i++) {
            countAll++;
            for(int j = i+1; j < numbersArray.length; j++) {
                if(numbersArray[i] == numbersArray[j]) {
                    countRepeating++;
                    break;
                }
            }
        }
        countUnique = countAll - countRepeating;
        return  countUnique;
    }
}
