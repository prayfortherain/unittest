import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void main() {
        int actual1 = Main.s(-15, 10);
        int actual2 = Main.s1(5, 20);
        int expected1 = -150;
        int expected2 = 100;
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
    }
}