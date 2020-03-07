package ru.job4j.array;

/**
 * class Turn переворачивает масив.
 *
 * @author dstepanov
 * @version 1
 * @since 07.03.2020
 */
public class Turn {
    /**
     * @param array - массив который будем переворачивать.
     * @return - возвращаем полученный результат.
     */
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int temp = array[index];
            if (index == 0) {
                array[index] = array[array.length - 1];
                array[array.length - 1] = temp;
            } else if (index < array.length / 2) {
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            } else break;
        }
        return array;
    }
}
