package zoo.battle;


import zoo.Bear;

public class FatalBattle implements Battle {

    public String fight(Bear attacker, Bear victim){
        victim.setHp(0);
        return attacker.display() + " kill " + victim.display();
    }


}
