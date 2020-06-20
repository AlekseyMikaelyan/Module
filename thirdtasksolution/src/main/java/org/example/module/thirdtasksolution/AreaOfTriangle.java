package org.example.module.thirdtasksolution;

public class AreaOfTriangle {

    public static double lengthBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double areaCalculation(double x1, double y1, double x2, double y2, double x3, double y3) {

        double firstLength = lengthBetweenTwoPoints(x1,y1,x2,y2);
        double secondLength = lengthBetweenTwoPoints(x2,y2,x3,y3);
        double thirdLength = lengthBetweenTwoPoints(x3,y3,x1,y1);

        double halfPerimeter = (firstLength + secondLength + thirdLength)/2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - firstLength) * (halfPerimeter - secondLength) * (halfPerimeter - thirdLength));
    }

}
