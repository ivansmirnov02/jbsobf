import jbsobf.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class Apptest {
    @Test
    public void Test(){
        Main main =new Main();
        assertFalse(Main.comp(new int[]{121,144,19,161,19,144,19,11}, new int[]{121,144,19,161,19,144,19,11}));
    }
}
