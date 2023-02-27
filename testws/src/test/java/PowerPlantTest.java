import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PowerPlantTest {

//    @Mock
//    Reactor reactor;

    private Reactor reactor = Mockito.mock(Reactor.class);

//    @Mock
//    TurbineGeneratorSystem turbineGeneratorSystem;

    private TurbineGeneratorSystem turbineGeneratorSystem = Mockito.mock(TurbineGeneratorSystem.class);

    @Test
    void addUranium() {
        PowerPlant powerPlant = new PowerPlant(reactor,turbineGeneratorSystem);
        powerPlant.addUranium(10);
        verify(reactor).addUranium(10);
    }

    @Test
    void generateElectricity() throws NotEnoughUraniumException {
        when(reactor.generateSteam(10)).thenReturn(10);
        when(turbineGeneratorSystem.generateElectricity(10)).thenReturn(50);
        PowerPlant powerPlant = new PowerPlant(reactor,turbineGeneratorSystem);
        int actual = powerPlant.generateElectricity(10);
        int expected = 50;
        assertEquals(expected,actual);
    }

    @Test
    void generatedElectricityIsZeroIfNotEnoughUranium() throws NotEnoughUraniumException {
        when(reactor.generateSteam(10)).thenThrow(NotEnoughUraniumException.class);
        when(turbineGeneratorSystem.generateElectricity(0)).thenReturn(0);
        PowerPlant powerPlant = new PowerPlant(reactor,turbineGeneratorSystem);
        int actual = powerPlant.generateElectricity(10);
        int expected = 0;
        assertEquals(expected,actual);
    }
}

