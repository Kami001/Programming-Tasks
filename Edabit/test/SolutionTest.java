import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

public class SolutionTest {

    @Test
    public void testSomething1() {
        assertEquals(true, XO.getXO("ooxx"));
    }

    @Test
    public void testSomething2() {
        assertEquals(false, XO.getXO("xooxx"));
    }

    @Test
    public void testSomething3() {
        assertEquals(true, XO.getXO("ooxXm"));
    }

    @Test
    public void testSomething4() {
        assertEquals(true, XO.getXO("zpzpzpp"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, XO.getXO("zzoo"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, XO.getXO("Xo"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XO.getXO("x"));
    }

    @Test
    public void testSomething8() {
        assertEquals(false, XO.getXO("o"));
    }

    @Test
    public void testSomething9() {
        assertEquals(false, XO.getXO("xxxoo"));
    }

    @Test
    public void testSomething10() {
        assertEquals(true, XO.getXO(""));
    }
}