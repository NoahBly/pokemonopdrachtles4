public class Main {
    public static void main(String[] args) {


    grassPokemon bulbasaur = new grassPokemon("bulbasaur",100,5,12,5,11,12);
    grasswaterPokemon ludicolo = new grasswaterPokemon("ludicolo",150,12,30,40,50,12);
    waterPokemon vaporeon = new waterPokemon("vaporeon",200,15,30,40,15,11);
    firePokemon charmander = new firePokemon("charmander",15,11,15,11,15,5);
    electricityPokemon jolteon = new electricityPokemon("jolteon",15,15,11,15,5,15);
        System.out.println("de pokemon heet " + bulbasaur.getName() + " en heeft als HP " + bulbasaur.getHP() + " en zijn level is " + bulbasaur.getLevel());


    bulbasaur.pokeDodge();
    bulbasaur.solarBeam();
    bulbasaur.pokeDodge();
    bulbasaur.tornadoleafs();
    bulbasaur.pokeRun();

        System.out.println("de pokemon heet " + ludicolo.getName() + " en heeft als HP " + ludicolo.getHP() + " en zijn grasshazard schade is " + ludicolo.getGrassHazard());

    ludicolo.pokeRun();
    ludicolo.tornadoleafs();
    ludicolo.waterBlast();
    ludicolo.pokeDodge();
    ludicolo.hydroPump();

        System.out.println("de pokemon heet " + vaporeon.getName() + " en heeft als HP " + vaporeon.getHP() + " en zijn hydrohazard schade is " + vaporeon.getHydroHazard());

    vaporeon.pokeRun();
    vaporeon.hydroPump();
    vaporeon.pokeDodge();
    vaporeon.waterBlast();
    vaporeon.pokeRun();

    System.out.println("de pokemon heet " + charmander.getName() + " en heeft als HP " + charmander.getHP() + " en zijn firehazard schade is " + charmander.getFireHazard());charmander.pokeDodge();charmander.fireCanon();

    charmander.pokeRun();
    charmander.ragingFlame();
    charmander.pokeDodge();

    System.out.println("de pokemon heet " + jolteon.getName() + " en heeft als HP " + jolteon.getHP() + " en zijn thunderbol schade is " + jolteon.getThunderBolt());jolteon.pokeRun();

    jolteon.doubleThunderpunch();
    jolteon.pokeDodge();
    jolteon.thunderBeam();
    jolteon.pokeRun();

    }
}
