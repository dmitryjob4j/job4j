package ru.job4j.condition;
//подключение библиотек автоматического тестирования JUnit
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TriangleTest {
    //Проверка треугольника с ожиданием резултата True
    @Test
    public void whenExist(){
        boolean result = Triangle.exist(2.0,2.0, 2.0);
        assertThat(result, is(true));
    }
    //Проверка треугольника с ожиданием False
    @Test
    public void whenExistFalse(){
        boolean result = Triangle.exist(3,6,2);
        assertThat(result, is(false));
    }
}
