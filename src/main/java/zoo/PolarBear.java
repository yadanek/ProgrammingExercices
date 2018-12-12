package zoo;

import zoo.battle.FatalBattle;

public class PolarBear extends AttakingBear {


    public PolarBear() {
        super(new FatalBattle());

    }

    @Override
    public int getWeight() {
        return 200;
    }

    @Override
    public String showMeBear() {
        return "Hello! I'm a Polar Bear. Wrrr!";
    }

    @Override
    public String display() {
        return "Polar Bear";
    }


}
