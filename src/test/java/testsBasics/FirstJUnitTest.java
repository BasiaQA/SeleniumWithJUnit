package testsBasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstJUnitTest extends TestBase {


    @Test
    public void thisIsMyFirstTest() {
        assertEquals("qax", "qax");
        assertEquals(2 + 2, 4);
        System.out.println(">>>>this is my first test!");
    }

    @Test
    public void thisIsMySecondTest() {
        int i = 2;
        assertEquals(i, 2);
        assertEquals(5 + 3, 9);
        System.out.println(">>>>this is my second test!");
    }

    @Test
    public void thisIsMyThirdTest() {
        assertEquals(2, 2);
        assertTrue(2 + 2 == 4);

        System.out.println(">>>>this is my third test!");
    }
}

