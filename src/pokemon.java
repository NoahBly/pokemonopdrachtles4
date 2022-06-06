public abstract class pokemon {

    private String name;
    private int HP;
    private int level;


    public pokemon (String name, int HP, int level) {
        this.name = name;
        this.HP = HP;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public int getHP() {
        return HP;
    }

    public int getLevel() {
        return level;
    }

    public void setName() {
        this.name = name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void pokeRun() {
        System.out.println("Pokemon does a crazy run move!");
    }

    public void pokeDodge() {
        System.out.println("Pokemon does an awesome dodge move!");
    }
}
