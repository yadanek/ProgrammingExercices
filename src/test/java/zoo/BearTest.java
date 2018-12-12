package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void shouldBearBeDeadWhekHPIs0() {

        Bear bear = new PolarBear();
        bear.setHp(0);
        assertFalse(bear.isAlive());
    }

    @Test
    void shouldBearBeAliveWhekHPIs50() {

        Bear bear = new PolarBear();
        bear.setHp(50);
        assertTrue(bear.isAlive());
    }
}