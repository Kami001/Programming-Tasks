import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ProgramTest {

    @Test
    public void test(){
        assertThat(Program.verifySubstrs("Onomatopeia", "on", "mato", "ia"), is("Incomplete."));
        assertThat(Program.verifySubstrs("Baby", "B", "ab", "y"), is("My head, body, and tail."));
        assertThat(Program.verifySubstrs("Centipede", "Cent", "tip", "pede"), is("My head, body, and tail."));
        assertThat(Program.verifySubstrs("Hey, you, stop that.", "Hey", ", y ou, st ", "."), is("Incomplete."));
        assertThat(Program.verifySubstrs("apple", "AP", "PPL", "LE"), is("Incomplete."));
    }
}