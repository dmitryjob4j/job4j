package ru.job4j.array;

/**
 * class проверяет заполнена ли символами указанная строка, столбец в двумерном массиве,
 * а также заполняет одномерный масив элементами из диагонали двумерного массива, и ищет выигрышный вариат сокобан.
 *
 * @author dstepanov
 * @version 1.2
 * @since 09.03.2020
 */
public class MatrixCheck {
    /**
     * monoHorizontal - проверяет не пустая ли заданная строка.
     *
     * @param board - проверяемый массив.
     * @param row   - строка которую нужно проверить.
     * @return - результат true/false.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * monoVertical -  проверяет не пустой ли заданный столбец.
     *
     * @param board  - проверяемый массив.
     * @param column - столбец которую нужно проверить.
     * @return - результат true/false.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * extractDiagonal - заполняет одномерный масив элементами из
     * диагонали двумерного массива.
     *
     * @param board - задаваемый двумерный масиив.
     * @return - результат возврощает одномерный массив.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    /**
     * isWin - "сокобан" метод проверяет выигрышный или нет расположение 'X' в массиве board.
     *
     * @param board - задоваемый массив должен быть квадратным.
     * @return - возвращает результат поиска.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
