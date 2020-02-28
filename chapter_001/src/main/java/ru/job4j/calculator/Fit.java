package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rls = (height - 100) * 1.15;
        return rls;
    }
    public static double womanWeight(double height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(190);
        double woman = Fit.womanWeight(175);
        System.out.println("Man 190 sm is " + man);
        System.out.println("Woman 175 sm is " + woman);
    }
}
