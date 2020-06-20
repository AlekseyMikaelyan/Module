package org.example.module.secondtasksolution;

public class HorseMove {

    public static boolean stepUp(int startX, int startY, int finishX, int finishY) {
        if(Math.abs(finishX - startX) == 2 && Math.abs(finishY - startY) == 1) {
            return true;
        } else {
            return Math.abs(finishX - startX) == 1 && Math.abs(finishY-startY) == 2;
        }
    }
}
