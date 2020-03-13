package ru.job4j.condition;

public class Triangle {
    //Метод exist проверяет возморжно ли получить треугольник из трех
    //сторон разной длены, по условию сумма двах стторон должна быть
    //больше третий для всех комбинаций
    public static boolean exist(double ab, double ac, double bc) {
        //проверяем условие если верно возврощаем true иначе false
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            return true;
        }
        return false;
    }
}
