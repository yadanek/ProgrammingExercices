package zoo.battle;

import org.junit.jupiter.api.Test;
import zoo.Bear;
import zoo.BlackBear;
import zoo.BrownBear;


import static org.junit.jupiter.api.Assertions.*;

class LightBattleTest {
    LightBattle lightBattle = new LightBattle();
    @Test
    void shouldBearbeAliveAfterbattle() {
        Bear attacker = new BrownBear(lightBattle);
        Bear victim = new BlackBear();

        lightBattle.fight(attacker, victim);

        assertTrue(attacker.isAlive());
        assertTrue(victim.isAlive());
        assertEquals(50, victim.getHp());
    }
    @Test
    void shouldBearBeDeadAfter2Battle() {
        Bear attacker = new BrownBear(lightBattle);
        Bear victim = new BlackBear();

        lightBattle.fight(attacker, victim);
        lightBattle.fight(attacker, victim);

        assertTrue(attacker.isAlive());
        assertFalse(victim.isAlive());
        assertEquals(0, victim.getHp());
    }

}