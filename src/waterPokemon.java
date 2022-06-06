public class waterPokemon extends pokemon implements waterable {

    int hydroAbsorbtion;

    int hydroHazard;

    int waterShield;

    int hydroScreen;

    public waterPokemon(String name, int HP, int level, int hydroAbsorbtion,int hydroHazard, int waterShield, int hydroScreen) {
        super(name, HP, level);
        this.hydroAbsorbtion = hydroAbsorbtion;
        this.hydroHazard = hydroHazard;
        this.waterShield = waterShield;
        this.hydroScreen = hydroScreen;
    }

    public int getHydroAbsorbtion() {
        return hydroAbsorbtion;
    }

    public int getHydroHazard() {
        return hydroHazard;
    }
    public int getWaterShield() {
        return waterShield;
    }
    public int getHydroScreen() {
        return hydroScreen;
    }

    public void setHydroAbsorbtion(int hydroAbsorbtion) {
        this.hydroAbsorbtion = hydroAbsorbtion;
    }

    public void setHydroHazard(int hydroHazard) {
        this.hydroHazard = hydroHazard;
    }

    public void setHydroScreen(int hydroScreen) {
        this.hydroScreen = hydroScreen;
    }

    public void setWaterShield(int waterShield) {
        this.waterShield = waterShield;
    }

    public void waterBlast() {
        System.out.println("Pokemon does a blast of water!");
    }
    public void hydroPump() {
        System.out.println("Pokemon gathers water surrounding him and perform a hydro pump!");
    }
    @Override
    public void pokeRun() {
        System.out.println("Pokemon creates waterfield and storm towards opponent!");
    }
    @Override
    public void pokeDodge() {
        System.out.println("Pokemon does an awesome dodge and creates a waterscreen!");
    }
}
