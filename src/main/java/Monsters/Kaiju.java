package Monsters;

public abstract class Kaiju {

    protected String name;
    protected int attackValue;
    protected int healthValue;


    public Kaiju(String name, int attackValue, int healthValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public String roar(){
        return "Rooooar!!!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


}
