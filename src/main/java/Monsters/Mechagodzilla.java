package Monsters;

import Monsters.IAttack;
import Monsters.IMove;

public class Mechagodzilla extends Kaiju implements IAttack, IMove {


    public Mechagodzilla(String name, int attackValue, int healthValue) {
        super (name, attackValue, healthValue);
    }

    public String roar(){
        return roar()+ "rrrr";
    }

    public int attack() {
        attackValue -= 15;
        healthValue += 5;
        return attackValue;
    }

    public String move() {
        healthValue -=3;
        return "Destroy";
    }
}
