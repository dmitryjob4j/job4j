package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(5, 2);
        Point b = new Point(11, 35);
        double expected = 33.541;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(5, 2, 6);
        Point b = new Point(11, 35, 17);
        double expected = 35.29;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
