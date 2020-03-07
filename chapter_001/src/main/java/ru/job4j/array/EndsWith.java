package ru.job4j.array;

/**
 * class сравнивает концовку символньго массива.
 *
 * @author dstepanov
 * @version 1
 * @since 07.03.2020
 */
public class EndsWith {
    /**
     * @param word массив символов 1.
     * @param post массив символов 2.
     * @return возврощает true или false по результату соответсвтия концовки массивов
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - index - 1] != post[post.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
