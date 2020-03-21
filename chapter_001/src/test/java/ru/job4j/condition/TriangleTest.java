package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void areaTriangle() {
        Point first = new Point(2, 5);
        Point second = new Point(5, 2);
        Point third = new Point(2, 2);
        Triangle areaT = new Triangle(first, second, third);
        double out = areaT.area();
        double expect = 4.49;
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void notTriangle() {
        Point first = new Point(3, 4);
        Point second = new Point(3, 4);
        Point third = new Point(4, 3);
        Triangle areaT = new Triangle(first, second, third);
        double out = areaT.area();
        double expect = -1;
        Assert.assertEquals(expect, out, 0.01);
    }
}

    /*/Проверка треугольника с ожиданием резултата True
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    //Проверка треугольника с ожиданием False
    @Test
    public void whenExistFalse() {
        boolean result = Triangle.exist(3, 6, 2);
        assertThat(result, is(false));
    }*/

