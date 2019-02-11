import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ProgramTest {

    @Test
    public void test(){
        assertThat(Program.alternatingCaps("alternating caps"), is("AlTeRnAtInG CaPs"));
        assertThat(Program.alternatingCaps("Hello, what's your name?"), is("HeLlO, wHaT'S YoUr nAmE?"));
        assertThat(Program.alternatingCaps("Lorem ipsum dolor sit amet, consectetur adipisicing elit."), is("LoReM IpSuM DoLoR SiT AmEt, CoNsEcTeTuR AdIpIsIcInG ElIt."));
        assertThat(Program.alternatingCaps("OMG!!! This website is awesome!!"), is("OmG!!! tHiS WeBsItE Is aWeSoMe!!"));
        assertThat(Program.alternatingCaps("The quick brown fox jumps over the lazy dog"), is("ThE QuIcK BrOwN FoX JuMpS OvEr tHe lAzY DoG"));
        assertThat(Program.alternatingCaps("The intent is to provide players with a sense of pride and accomplishment for unlocking different heroes."), is("ThE InTeNt iS To pRoViDe pLaYeRs wItH A SeNsE Of pRiDe aNd aCcOmPlIsHmEnT FoR UnLoCkInG DiFfErEnT HeRoEs."));
    }
}