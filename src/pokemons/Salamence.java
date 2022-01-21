package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Salamence extends Pokemon {
    public Salamence(String name, int level) {
        super(name, level);
        setStats(95, 135, 80, 110, 80, 100);
        setType(Type.PSYCHIC, Type.FIGHTING);
        addMove(new Blizzard());
        addMove(new Ice_Beam());
        addMove(new Fire_Punch());
        addMove(new Charge_Beam());


    }
}
