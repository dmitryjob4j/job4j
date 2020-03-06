package ru.job4j.array;

/**
 * Class 6.0.3. Массивы и цикл for. [#242759]
 * @author dstepanov
 * @version 1
 * @since 06.03.2020
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
