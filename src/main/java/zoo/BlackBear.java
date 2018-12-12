package zoo;


import zoo.battle.Battle;
import zoo.battle.LightBattle;

public class BlackBear extends AttakingBear{
    private int hp = 0;

    public BlackBear() {
        super (new LightBattle());
    }

    public BlackBear(Battle battleAlgorithm) {
        super(battleAlgorithm);
    }

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public String showMeBear() {
        return "Hello! I'm a Black Bear. Wrrr!";
    }

    @Override
    public String display() {
        return "Black Bear";
    }




}
