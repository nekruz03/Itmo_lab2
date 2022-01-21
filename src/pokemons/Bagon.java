package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bagon extends Pokemon {
    public Bagon(String name, int level) {
        super(name, level);
        setStats(45, 75, 60, 40, 30, 50);
        setType(Type.DRAGON);
        addMove(new Blizzard());
        addMove(new Ice_Beam());

    }
}
