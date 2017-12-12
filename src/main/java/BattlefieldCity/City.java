package BattlefieldCity;

import Monsters.Godzilla;
import Monsters.Kaiju;
import Monsters.Mechagodzilla;
import Vehicle.Grader;
import Vehicle.Tank;
import Vehicle.Vehicle;


public class City {

    protected String name;
    public Kaiju godzilla;
    public Kaiju mechagodzilla;
    public Vehicle tank;
    public Vehicle grader;
    public UI ui;


    public City(Kaiju godzilla, Kaiju mechagodzilla, Vehicle tank, Vehicle grader, String name, UI ui){
        this.godzilla = godzilla;
        this.mechagodzilla = mechagodzilla;
        this.tank = tank;
        this.grader = grader;
        this.name = name;
        this.ui = ui;

    }

}
