package zoo.battle;


import zoo.Bear;

public class LightBattle implements Battle{

    @Override
    public String fight(Bear attacker, Bear victim) {
        victim.setHp(victim.getHp()-50);
        return attacker.display() + " hurt " + victim.display();
    }
}
