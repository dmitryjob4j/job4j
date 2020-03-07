package ru.job4j.array;

/**
 * class сравнение символов в двух массивах.
 *
 * @author dstepanov
 * @version 1
 * @since 07.03.2020
 */
public class ArrayChar {
    /**
     * @param world массив символов 1.
     * @param pref  массив символов 2.
     * @return возврощает true или false по результату соответсвтия массивов.
     */
    public static boolean startsWith(char[] world, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (world[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
