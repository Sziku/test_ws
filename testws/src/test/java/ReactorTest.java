import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactorTest {

    Reactor reactor;

    @BeforeEach
    void init(){
        reactor = new Reactor(10);
    }

    @Test
    void storedUraniumQuantityCanBeChecked() {
        //Reactor reactor = new Reactor(10);
        int actual = reactor.getStoredUranium();
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    void uraniumCanBeAdded() {
        //Reactor reactor = new Reactor(10);
        reactor.addUranium(10);
        int actual = reactor.getStoredUranium();
        int expected = 20;
        assertEquals(expected,actual);
    }

    @Test
    void canGenerateSteam() throws NotEnoughUraniumException {
        //Reactor reactor = new Reactor(10);
        int actual = reactor.generateSteam(3);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void uraniumUsedForGeneratingSteam() throws NotEnoughUraniumException {
        //Reactor reactor = new Reactor(10);
        reactor.generateSteam(3);
        int actual = reactor.getStoredUranium();
        int expected = 7;
        assertEquals(expected,actual);
    }

    @Test
    void canThrowNotEnoughUraniumException() throws NotEnoughUraniumException {
        //Reactor reactor = new Reactor(10);
        assertThrows(NotEnoughUraniumException.class, () -> reactor.generateSteam(11));
    }
}