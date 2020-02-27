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
        double man = Fit.manWeight(190); //идеальный мужчины при росте 190 см
        double woman = Fit.womanWeight(175); //идеальный вес женщины при росте 175 см
        System.out.println("Man 190 sm is " + man + " kg");
        System.out.println("Woman 175 sm is " + woman + " kg");
    }
}
