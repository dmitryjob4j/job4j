package ru.job4j.array;

/**
 * class проверяет все ли элементы массива одинаковы.
 *
 * @author dstepanov
 * @version 1
 * @since 07.03.2020
 */
public class Check {
    /**
     * @param data массив заполняемый произвольними true false.
     * @return возврощаем результат проверки массива.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
