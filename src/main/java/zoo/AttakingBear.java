package zoo;


import zoo.battle.Battle;

public abstract class AttakingBear extends Bear implements Attackable {

    private final Battle battleAlgorithm;


    protected AttakingBear(Battle battleAlgorithm) {
        super();
        this.battleAlgorithm = battleAlgorithm;
    }

    @Override
    public String attack(Bear victim) {
        return battleAlgorithm.fight(this, victim);
    }



}
