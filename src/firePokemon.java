public class firePokemon extends pokemon {

    int fireAbsorption;

    int fireHazard;

    int fireShield;

    int fireScreen;

    public firePokemon(String name, int HP, int level, int fireAbsorption, int fireHazard, int fireShield, int fireScreen) {
        super(name, HP, level);
        this.fireAbsorption = fireAbsorption;
        this.fireHazard = fireHazard;
        this.fireShield = fireShield;
        this.fireScreen = fireScreen;
    }

    public int getFireAbsorption() {
        return fireAbsorption;
    }

    public int getFireHazard() {
        return fireHazard;
    }

    public int getFireShield() {
        return fireShield;
    }
    public int getFireScreen() {
        return fireScreen;
    }

    public void setFireAbsorption(int fireAbsorption) {
        this.fireAbsorption = fireAbsorption;
    }

    public void setFireHazard(int fireHazard) {
        this.fireHazard = fireHazard;
    }
    public void setFireShield(int fireShield) {
        this.fireShield = fireShield;
    }
    public void setFireScreen(int fireScreen) {
        this.fireScreen = fireScreen;
    }

    public void ragingFlame(){
        System.out.println("Pokemon charges up and does a burst of raging flames!");
    }
    public void fireCanon() {
        System.out.println("Pokemon blasts an orb of fire towards opponent!");
    }
    @Override
    public void pokeRun() {
        System.out.println("Pokemon does an awesome sprint move towards opponent!");
    }
    @Override
    public void pokeDodge() {
        System.out.println("Pokemon creates smoke screen and dodges opponent!");
    }
}
