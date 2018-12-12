package zoo.battle;

import org.junit.jupiter.api.Test;
import zoo.Bear;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BattleTest {

    private Bear bear1 = mock(Bear.class);
    private Bear bear2 = mock(Bear.class);

    public BattleTest(){
        when(bear1.display()).thenReturn("Bear1");
        when(bear2.display()).thenReturn("Bear2");
    }

    @Test
    void shouldFatalBattleKillOpponent() {

        Battle battle = new FatalBattle();
        String fight = battle.fight(bear1, bear2);
        assertEquals("Bear1 kill Bear2", fight);
    }

    @Test
    void shouldLightBattleHurtOpponent() {
        Battle battle = new LightBattle();
        String fight = battle.fight(bear1, bear2);
        assertEquals("Bear1 hurt Bear2", fight);
    }
}