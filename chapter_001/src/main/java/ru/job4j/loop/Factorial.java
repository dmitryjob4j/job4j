package ru.job4j.loop;

public class Factorial {
    public static int calc(int n){
        int result = 1;
        //считаем факториал от "n"
        for (int index = 1; index <= n; index++) {
            result = result * index;
        }
        return result;
        }
}

