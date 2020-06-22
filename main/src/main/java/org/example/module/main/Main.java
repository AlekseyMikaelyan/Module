package org.example.module.main;

import org.example.module.fifthtasksolution.BinaryTree;
import org.example.module.firsttasksolution.ArrayOfNumbers;
import org.example.module.fourthtasksolution.StringValidator;
import org.example.module.secondtasksolution.HorseMove;
import org.example.module.thirdtasksolution.AreaOfTriangle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] array = new int [100];
        ArrayOfNumbers.arrayMaker(array);
        System.out.println(ArrayOfNumbers.countOfUniqueNumbers(array));//Task number one

        System.out.println("\n=================\n");

        System.out.println(HorseMove.stepUp(3,2,5,1));//Task number two

        System.out.println("\n=================\n");

        System.out.println(AreaOfTriangle.areaCalculation(17.0, 3.0, 4.0, 2.0, 1.0, 14.0));//Task number three

        System.out.println("\n=================\n");

        StringValidator.stringChecking("({}[])");//Task number four

        System.out.println("\n=================\n");

        System.out.println(BinaryTree.maxDepth(new BinaryTree(5)));
    }
}
