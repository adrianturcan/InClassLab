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
    public void detectCapitalUseTest1() {
        myString.setString("cD");
        assertFalse(myString.toString().contains(".*[A-Z].*"), "myString does not contain capital letters");

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Capital");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }


}
