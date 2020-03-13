package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        //указываем циклу переменные где начало где конец
        for (int index = start; index <= finish; index++) {
            //Сумируем заданный диапозон цикла
            sum = sum + index;
        }
        return sum;
    }

    //Метод подсчета суммы четных чисел в заданном диапозоне
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        //указываем циклу переменные где начало где конец
        for (int index = start; index <= finish; index++) {
            //проверяем четное число или нет
            if (index % 2 == 0) {
                //если число четное то сумируем его
                sum = sum + index;
            }
            //если число не четное (остток от деления не равен нулю)
            //то наращиваем цикл и проверяем следующий элемент
        }
        return sum;
    }
   /* //выводим метод sum c различными значениями
    public static void main (String[] args){
        System.out.println(sum(0,10));
        System.out.println(sum(3,8));
        System.out.println(sum(1,1));
        System.out.println(sum(9,16));
        System.out.println(sum(33,45));
        System.out.println(sum(100,101));
    }*/
}
