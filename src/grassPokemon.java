public class grassPokemon extends pokemon{


    int solarAbsorbtion;
    int grassHazard;

    int grassShield;

    int dustScreen;


    public grassPokemon(String name, int HP, int level, int solarAbsorbtion, int grassHazard, int grassShield, int dustScreen) {
        super(name, HP, level);
        this.solarAbsorbtion = solarAbsorbtion;
        this.grassHazard = grassHazard;
        this.grassShield = grassShield;
        this.dustScreen = dustScreen;
    }

    public int getSolarAbsorbtion() {
        return solarAbsorbtion;
    }
    public int getGrassHazard() {
        return grassHazard;
    }

    public int getGrassShield() {
        return grassShield;
    }
    public int getDustScreen() {
        return dustScreen;
    }

    public void setSolarAbsorbtion(int solarAbsorbtion) {
        this.solarAbsorbtion = solarAbsorbtion;
    }

    public void setGrassHazard(int grassHazard) {
        this.grassHazard = grassHazard;
    }
    public void setGrassShield(int grassShield) {
        this.grassShield = grassShield;
    }
    public void setDustScreen(int dustScreen) {
        this.dustScreen = dustScreen;
    }

    public void solarBeam() {
        System.out.println("Pokemon performs a Solar Beam!");
    }

    public void tornadoleafs() {
        System.out.println("Pokemon does a Tornado of leafs!");
    }

    @Override
   public void pokeRun() {
        System.out.println("Grass pokemon does a crazy run move and creates a ravage of leafs!");
    }
    @Override
    public void pokeDodge() {
        System.out.println("Grass pokemon does an awesome dodge move and creates a leaf screen!");
    }

}
