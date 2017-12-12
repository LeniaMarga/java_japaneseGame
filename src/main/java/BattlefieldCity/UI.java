package BattlefieldCity;

import Monsters.Kaiju;
import Vehicle.Vehicle;

import javax.smartcardio.Card;
import java.util.ArrayList;


    public class UI {

        public void showAll(ArrayList<Kaiju> monsters, ArrayList<Vehicle> vehicles){

            for(int i = 0; i<50; i++){
                System.out.print("*");
            }
            System.out.println();
            for (Kaiju monster : monsters){
                System.out.println("\n" + monster.getName() + " has " + monster.getAttackValue ());
            }
            System.out.println();
            pause();
        }

        public void playRound(ArrayList<Kaiju> monsters, ArrayList<Vehicle> vehicles){
            for (Kaiju monster : monsters) {
                for (Vehicle vehicle : vehicles) {
                    monster.attack();
                    System.out.println(monster.getName());
                }
                System.out.println();
                pause();
            }
        }

        public void showWinner(Kaiju winner){
            if (!winner.equals(null)){
                System.out.println(winner.getName() + " wins.");
            } else {
                System.out.println("It's a draw");
            }
            goodbye();
        }

        public void goodbye() {
            System.out.println("\nGame Over");
            System.exit(1);

        }


        public void pause(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


