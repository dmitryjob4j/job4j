package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        //Переводим на новую строку height раз (строки)
        for (int row = 0; row < height; row++) {
            //Печатаем X - width раз (столбцы)
            for (int cell = 0; cell < width; cell++) {
                //Проверяем условия когда печатать пробел а когда 0
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Вызываем метод для печати шахмотной доски
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(8, 8);
    }
}
