package org.example.module.main;

import org.example.module.fifthtasksolution.BinaryTree;
import org.example.module.firsttasksolution.ArrayOfNumbers;
import org.example.module.fourthtasksolution.StringValidator;
import org.example.module.secondtasksolution.HorseMove;
import org.example.module.sixthtasksolution.Window;
import org.example.module.thirdtasksolution.AreaOfTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Модуль № 1 :");
        mainMenu();
    }
    private static void mainMenu() throws IOException {
        String enter;
        while (true) {
            System.out.println();
            System.out.println("Введите 1 - отработка задач № 1 - 5");
            System.out.println("Введите 2 - запуск игры Жизнь");
            System.out.println("\nВведите команду: ");
            enter = reader.readLine();
            if (enter.equals("1")) {
                workOutTasksOneToFive();
            }
            if (enter.equals("2")) {
                launchTheLifeGame();
            }
            if(!enter.equals("1") && !enter.equals("2")) {
                System.out.println("Неверная команда!");
            }

        }
    }

    static void workOutTasksOneToFive() {
        int[] array = new int[100];
        ArrayOfNumbers.arrayMaker(array);
        System.out.println(ArrayOfNumbers.countOfUniqueNumbers(array));//Task number one

        System.out.println("\n=================\n");

        System.out.println(HorseMove.stepUp(3, 2, 5, 1));//Task number two

        System.out.println("\n=================\n");

        System.out.println(AreaOfTriangle.areaCalculation(17.0, 3.0, 4.0, 2.0, 1.0, 14.0));//Task number three

        System.out.println("\n=================\n");

        StringValidator.stringChecking("({}[])");//Task number four

        System.out.println("\n=================\n");

        System.out.println(BinaryTree.maxDepth(new BinaryTree(5)));
    }

    static void launchTheLifeGame() {
        Window window = new Window();
        javax.swing.SwingUtilities.invokeLater(window);
    }
}

