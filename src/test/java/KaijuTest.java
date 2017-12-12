import Monsters.Godzilla;
import Monsters.Mechagodzilla;
import org.junit.Before;

public class KaijuTest {

    Godzilla godzilla;
    Mechagodzilla mechagodzilla;

    @Before
    public void before(){
        godzilla = new Godzilla ("godzo", 400, 300);
        mechagodzilla = new Mechagodzilla ("kim", 350, 350);

    }



}
