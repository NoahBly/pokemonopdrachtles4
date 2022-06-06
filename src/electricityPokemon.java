public class electricityPokemon extends pokemon{

    int zapShock;

    int thunderBolt;

    int voltTackle;

    int thunderPunch;

    public electricityPokemon(String name, int HP, int level, int zapShock, int thunderBolt, int voltTackle, int thunderPunch) {
        super(name, HP, level);
        this.zapShock = zapShock;
        this.thunderBolt = thunderBolt;
        this.voltTackle = voltTackle;
        this.thunderPunch = thunderPunch;
    }

    public int getZapShock() {
        return zapShock;
    }

    public int getThunderBolt() {
        return thunderBolt;
    }

    public int getVoltTackle() {
        return voltTackle;
    }
    public int getThunderpunch() {
        return thunderPunch;
    }
    public void setZapShock() {
        this.zapShock = zapShock;
    }
    public void setThunderBolt() {
        this.thunderBolt = thunderBolt;
    }
    public void setVoltTackle() {
        this.voltTackle = voltTackle;
    }
    public void setThunderPunch() {
        this.thunderPunch = thunderPunch;
    }

    public void thunderBeam() {
        System.out.println("Pokemon gathers energy and performs a beam of thunder!");
    }
    public void doubleThunderpunch() {
        System.out.println("Pokemon runs towards opponent and gives a double thunderpunch!");
    }
    @Override
    public void pokeRun() {
        System.out.println("Pokemon charges up and flashes towards opponent!");
    }
   @Override
    public void pokeDodge() {
        System.out.println("Pokemon creates a flash screen and dodges opponent!");
    }
}
