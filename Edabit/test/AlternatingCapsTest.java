import static org.hamcrest.core.Is.is;
        import org.junit.Test;
        import static org.junit.Assert.assertThat;

public class AlternatingCapsTest {

    @Test
    public void test(){
        assertThat(AlternativeCaps.alternatingCaps("alternating caps"), is("AlTeRnAtInG CaPs"));
        assertThat(AlternativeCaps.alternatingCaps("Hello, what's your name?"), is("HeLlO, wHaT'S YoUr nAmE?"));
        assertThat(AlternativeCaps.alternatingCaps("Lorem ipsum dolor sit amet, consectetur adipisicing elit."), is("LoReM IpSuM DoLoR SiT AmEt, CoNsEcTeTuR AdIpIsIcInG ElIt."));
        assertThat(AlternativeCaps.alternatingCaps("OMG!!! This website is awesome!!"), is("OmG!!! tHiS WeBsItE Is aWeSoMe!!"));
        assertThat(AlternativeCaps.alternatingCaps("The quick brown fox jumps over the lazy dog"), is("ThE QuIcK BrOwN FoX JuMpS OvEr tHe lAzY DoG"));
        assertThat(AlternativeCaps.alternatingCaps("The intent is to provide players with a sense of pride and accomplishment for unlocking different heroes."), is("ThE InTeNt iS To pRoViDe pLaYeRs wItH A SeNsE Of pRiDe aNd aCcOmPlIsHmEnT FoR UnLoCkInG DiFfErEnT HeRoEs."));
    }
}