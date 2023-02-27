//There is a reactor class
//There is an public int getStoredUranium() which returns the quantity of uranium in the reactor.
//When we create a new reactor we should be able to set how many uranium are in it.
//There is an public void addUranium(int uraniumToAdd) method. When it's called
//the quantity of uranium stored in the reactor should be increased by the number given in the parameter.
//There is a public int generateSteam(int waterIntake) it returns the quantity of genarated steam by the reactor.
//For one unit of steam one unit of water and one unit of uranium is used.
//If not enough uranium to generete steam from all water it throws NotEnoughUraniumException.
public class Reactor {

    private int storedUranium;

    public Reactor(int storedUranium) {
        this.storedUranium = storedUranium;
    }

    public int getStoredUranium() {
        return storedUranium;
    }

    public void addUranium(int uraniumToAdd){
        storedUranium += uraniumToAdd;
    }

    public int generateSteam(int waterIntake) throws NotEnoughUraniumException {
        if(waterIntake > storedUranium){
            throw new NotEnoughUraniumException();
        }
        storedUranium -= waterIntake;
        return waterIntake;
    }

}
