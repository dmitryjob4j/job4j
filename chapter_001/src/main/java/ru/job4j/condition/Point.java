package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * 4. Расстояние между точками в трехмерном пространстве.[#242911]
 * задача
 *
 * @author dstepanov
 * @version 3
 * @since 21.03.2020
 */
public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}

   /* public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }*/

    /*public static void main(String[] args) {
        double result = Point.distance(5, 2, 11, 35);
        System.out.println("result (5, 2) to (11, 35) " + result);
    }*/
