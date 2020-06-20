package org.example.module.firsttasksolution;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOfNumbersTest {

    int [] array;
    int [] randomNumbersArray;

    @Test
    public void methodShouldReturnCountOfUniqueNumbers() {
        array = new int[10];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        array[3] = 3;
        array[4] = 2;
        array[5] = 1;
        array[6] = 3;
        array[7] = 4;
        array[8] = 9;
        array[9] = 2;
        Assert.assertEquals(6,ArrayOfNumbers.countOfUniqueNumbers(array));
    }

    @Test
    public void MethodShouldReturnCorrectArray() {
        randomNumbersArray = new int [100];
        ArrayOfNumbers.arrayMaker(randomNumbersArray);
        for(int i = 0; i < randomNumbersArray.length; i++) {
            Assert.assertTrue(randomNumbersArray[i] < 100);
        }
    }
}
