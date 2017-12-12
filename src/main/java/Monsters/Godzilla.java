package Monsters;

public class Godzilla extends Kaiju implements IAttack, IMove {


    public Godzilla(String name, int attackValue, int healthValue) {
        super (name, attackValue, healthValue);

    }

    public String roar(){
        return roar()+ "massively";
    }

    public int attack() {
        attackValue -= 10;
        healthValue += 10;
        return attackValue;
    }


    public String move() {
        healthValue -=2;
        return "Destroy";
    }
}
