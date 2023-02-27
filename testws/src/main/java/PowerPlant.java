public class PowerPlant {
    private Reactor reactor;
    private TurbineGeneratorSystem turbineGeneratorSystem;

    public PowerPlant(Reactor reactor, TurbineGeneratorSystem turbineGeneratorSystem) {
        this.reactor = reactor;
        this.turbineGeneratorSystem = turbineGeneratorSystem;
    }

    public void addUranium(int uraniumToAdd){
        reactor.addUranium(uraniumToAdd);
    }

    public int generateElectricity(int waterIntake){
        int steam = 0;
        try {
            steam = reactor.generateSteam(waterIntake);
        } catch (NotEnoughUraniumException e) {
            e.printStackTrace();
        }
        return turbineGeneratorSystem.generateElectricity(steam);
    }
}
//https://dzone.com/articles/7-popular-unit-test-naming