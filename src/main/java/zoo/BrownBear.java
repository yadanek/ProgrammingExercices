package zoo;

import zoo.battle.Battle;
import zoo.battle.LightBattle;

public class BrownBear extends AttakingBear  {

    public BrownBear() {
        super(new LightBattle());
    }

    public BrownBear(Battle battleAlgorithm) {
        super(battleAlgorithm);
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public String showMeBear() {
        return "Hello! I'm a Brown Bear. Wrrr!";
    }

    @Override
    public String display() {
        return "Brown Bear";
    }




}