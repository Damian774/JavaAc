package altkom.pl;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    static MonkeyTrouble monkeyTrouble;

    @BeforeClass
    public static void initialize(){
      monkeyTrouble = new MonkeyTrouble();
    }

    @Test
    public void shouldReturnTrueWhenTrueTrue() {
        boolean a = true;
        boolean b = true;

        assertTrue(monkeyTrouble.monkeyTrouble(a,b));

    }

    @Test
    public void shouldReturnTrueWhenFalseFalse() {
        boolean a = false;
        boolean b = false;
        assertTrue(monkeyTrouble.monkeyTrouble(a,b));

    }

    @Test
    public void shouldReturnFalseWhenTrueFalse() {
        boolean a = true;
        boolean b = false;
        assertFalse(monkeyTrouble.monkeyTrouble(a,b));

    }

    @Test
    public void shouldReturnFalseWhenFalseTrue() {
        boolean a = false;
        boolean b = true;
        assertFalse(monkeyTrouble.monkeyTrouble(a,b));

    }

}

/*monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false*/