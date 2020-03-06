package ru.job4j.array;
/**
 * Class заполнить массив квадратом чисел в диапозоне до bound
 * и выводит его на экран.
 * @author dstepanov
 * @version 1
 * @since 07.02.2020
 */
public class Square {
    /**
     * calculate заполняет масив квадратом чисел.
     * @param bound - размер масива.
     * @return rst
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }

    /**
     * main вывод на экран результат метода calculate.
     * @param args - args
     */
    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
