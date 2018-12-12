package zoo.battle;

import org.junit.jupiter.api.Test;
import zoo.Bear;
import zoo.BlackBear;

import static org.junit.jupiter.api.Assertions.*;

class FatalBattleTest {
    FatalBattle fatalBattle = new FatalBattle();

    @Test
    void shouldBearNotAliveAfterBattle() {
         //given
        Bear attacker = new BlackBear(fatalBattle);
        Bear victim = new BlackBear();
        // when
        fatalBattle.fight(attacker, victim);
        //then
        assertFalse(victim.isAlive(),"Victim should be dead");
        assertTrue(attacker.isAlive(), "Attaker should be alive");
    }
}