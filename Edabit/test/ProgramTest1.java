import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ProgramTest1 {

    @Test
    public void test(){
        assertThat(Program1.cumulativeSum(new int[]{}), is (new int[]{}));
        assertThat(Program1.cumulativeSum(new int[]{1}), is (new int[]{1}));
        assertThat(Program1.cumulativeSum(new int[]{1,2,3}), is (new int[]{1,3,6}));
        assertThat(Program1.cumulativeSum(new int[]{-1,-2,-3}), is (new int[]{-1,-3,-6}));
        assertThat(Program1.cumulativeSum(new int[]{1,-2,3}), is (new int[]{1,-1,2}));
        assertThat(Program1.cumulativeSum(new int[]{3, 3, -2, 408, 3, 3, 0, 66, 2, -2, 2, 3, 4, 2, -47, 3, 3, 2}), is (new int[]{3, 6, 4, 412, 415, 418, 418, 484, 486, 484, 486, 489, 493, 495, 448, 451, 454, 456}));
    }
}