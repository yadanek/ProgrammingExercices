package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturn1IfNumberIs1() {
        //given
        FizzBuzz number = new FizzBuzz();
        //when
       // number.playGames(1);
        //then
        assertEquals("1", number.playGames(1));
    }

    @Test
    void shouldReturnFIZZIfNumberDividedBy3() {
        //given
        FizzBuzz number = new FizzBuzz();
        //when
        //then
        assertEquals("FIZZ", number.playGames(3));
        assertEquals("FIZZ", number.playGames(6));
        assertEquals("FIZZ", number.playGames(9));
    }

    @Test
    void shouldReturnBUZZIfNumberDividedBy5() {
        //given
        FizzBuzz number = new FizzBuzz();
        //when
        //then
        assertEquals("BUZZ", number.playGames(5));
        assertEquals("BUZZ", number.playGames(10));
    }
    @Test
    void shouldReturnFIZZBUZZIfNumberDividedBy5And3() {
        //given
        FizzBuzz number = new FizzBuzz();
        //when
        //then
        assertEquals("FIZZBUZZ", number.playGames(15));
    }

}