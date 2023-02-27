import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurbineGeneratorSystemTest {

    @Test
    void canGenerateElectricity() {
        TurbineGeneratorSystem turbineGeneratorSystem = new TurbineGeneratorSystem();
        int actual = turbineGeneratorSystem.generateElectricity(3);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void zeroSteamGeneratesZeroElectricity() {
        TurbineGeneratorSystem turbineGeneratorSystem = new TurbineGeneratorSystem();
        int actual = turbineGeneratorSystem.generateElectricity(0);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void throwsIllegalArgumentException() {
        TurbineGeneratorSystem turbineGeneratorSystem = new TurbineGeneratorSystem();
        assertThrows(IllegalArgumentException.class,() -> turbineGeneratorSystem.generateElectricity(-1));
    }
}