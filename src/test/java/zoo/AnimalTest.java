package zoo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


class AnimalTest {

    @Test
    void shouldBearBeAlive() throws IDontEatException {
        //given
        Animal animal = new BrownBear();
        //when
        animal.eat();
        //then
        assertTrue(animal.isAlive());

    }

    @Test
    void shouldBeDeadifNotEatSince11Days() {
        //given
        Animal animal = spy(new BrownBear());
        //when
        LocalDate elevendaysBefore = LocalDate.now()
                .minus(11, ChronoUnit.DAYS);
        when(animal.getDateWhenLastEat()).thenReturn(elevendaysBefore);
        //then
        assertFalse(animal.isAlive());

    }

    @Test
    void shouldThrowExceptionWhenTryToFeedTeddyBear() {
        //given
        Animal teddyBear = new TeddyBear();
        assertThrows(IDontEatException.class, teddyBear::eat);// przesyłąmy referencję na metodę

    }

    @Test
    void shouldWeight50IfBearIsBlackBear() {
        Bear bear = new BlackBear();
        assertEquals(bear.getWeight(), 50);
    }

    @Test
    void shouldWeight100IfBearIsBrownbear() {
        Bear bear = new BrownBear();
        assertEquals(bear.getWeight(), 100);
    }

    @Test
    void shouldWeight200IfBearIsPolarBear() {
        Bear bear = new PolarBear();
        assertEquals(bear.getWeight(), 200);
    }

    @Test
    void shouldBrownBearViewIMBrownBear() {
        //given
        Animal animal = new BrownBear();
        //when
        animal.showMeBear();
        //then
        assertEquals(animal.showMeBear(),"Hello! I'm a Brown Bear. Wrrr!");
    }

    @Test
    void shouldBlackBearViewIMBlackBear() {
        //given
        Animal animal = new BlackBear();
        //when
        animal.showMeBear();
        //then
        assertEquals(animal.showMeBear(),"Hello! I'm a Black Bear. Wrrr!");
    }

    @Test
    void shouldPolarBearViewIMPolarBear() {
        //given
        Animal animal = new PolarBear();
        //when
        animal.showMeBear();
        //then
        assertEquals(animal.showMeBear(),"Hello! I'm a Polar Bear. Wrrr!");
    }

    @Test
    void shouldTeddyBearViewIMTeddyBear() {
        //given
        Animal animal = new TeddyBear();
        //when
        animal.showMeBear();
        //then
        assertEquals(animal.showMeBear(),"Hello! I'm a Teddy Bear. I love you!");
    }


}