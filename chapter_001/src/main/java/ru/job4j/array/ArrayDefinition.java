package ru.job4j.array;

/**
 * Class класс для для обевления пременных масива
 *
 * @author dstepanov
 * @version 1
 * @since 05.03.2020
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Dmitry Stepanov";
        names[2] = "05 march 2020";
        names[3] = "elementary";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
