package ru.job4j.array;

public class BarleyBreak {
    public static void main() {
        int[][] table = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = num;
                num += 1;
            }
        }
    }
}
