package ru.job4j.loop;

/**
 * class Slash рисует крест в псевдографике заданного размера
 *
 * @author dstepanov
 * @since 04.03.2020
 */
public class Slash {
    /**
     * Масивы и условия формирования креста по заданному параметру
     *
     * @param size - размер креста size на size
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = cell == size - row - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Конструктор вывода строк по методу draw
     *
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
