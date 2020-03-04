package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent){
        int year = 0;
        percent = percent/100;
        double i = amount;
        while (i >= 0){
            i = i * percent + i - salary;
            year+=1;
        }
        return year;
    }
}
