package ru.job4j.condition;

public class SqArea {
    public static double sqare(int p, int k) {
        double rsl = (((p/(2*k+2))*k)*(p/(2*k+2)));
        return rsl;
    }
    public static void main(String[] args){
        double result1 = SqArea.sqare(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
