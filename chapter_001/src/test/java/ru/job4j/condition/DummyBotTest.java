package ru.job4j.condition;
//Импортируем библиотеки для тестов
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
// Обьявляем класс DummyBotTest
public class DummyBotTest {
    @Test
    //Метод проверки первого вопроса
    public void whenGreetBot(){
        assertThat(
                DummyBot.answer("Привет, Бот."),//задоваемый вопрос
                is("Привет, умник.")//ожидаемый ответ
        );
    }
    @Test
    //Метод проверки второго вопроса
    public void whenByeBot(){
        assertThat(
                DummyBot.answer("Пока."),//задоваемый вопрос
                is("До скорой встречи.")//ожидаемый ответ
        );
    }
    @Test
    //Метод проверки вопроса который не знает бот
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2+2?"),// задоваемы вопрос любой
                is("Это ставит меня в тупик. Задайте другой вопрос.")//ожидаемый ответ
        );
    }
}
