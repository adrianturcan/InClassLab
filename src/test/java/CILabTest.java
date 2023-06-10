import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;


    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }
    @Test
    public void add_emptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void Null() {
        assertFalse(myString.getString() == null);
    }

    @Test
    public void detectCapitalUseTest1() {

        if(myString.toString().matches(".*[A-Z].*"))
            System.out.println("The String contains Uppercase letter(s)");
        else {
            fail("");
        }

    }
    @Test
    public void detectCapitalUseTest2() {
        fail();
    }


}
