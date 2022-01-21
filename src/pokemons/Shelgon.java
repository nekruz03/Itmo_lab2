package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shelgon extends Pokemon {
    public Shelgon(String name, int level) {
        super(name, level);
        setStats(65, 95, 100, 60, 50, 50);
        setType(Type.DRAGON);
        addMove(new Blizzard());
        addMove(new Ice_Beam());
        addMove(new Fire_Punch());
    }

}
