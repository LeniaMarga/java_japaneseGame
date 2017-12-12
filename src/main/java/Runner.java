import BattlefieldCity.City;
import BattlefieldCity.UI;
import Monsters.Godzilla;
import Monsters.Kaiju;
import Monsters.Mechagodzilla;
import Vehicle.Grader;
import Vehicle.Tank;
import Vehicle.Vehicle;


public class Runner {

    public static void main(String[] args) {

        Kaiju godzo = new Godzilla ("godzo", 400, 300);
        Kaiju kim = new Mechagodzilla ("kim", 350, 350);
        Vehicle grader1 = new Grader ("army grader", 200);
        Vehicle tank2 = new Tank ("army tank", 300);
        UI ui = new UI();
        City battlefield = new City( godzo, kim, grader1, tank2, "Tokyo", ui);

    }



}
