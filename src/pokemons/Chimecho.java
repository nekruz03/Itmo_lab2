package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimecho extends Pokemon {
    public Chimecho(String name, int level) {
        super(name, level);
        setStats(75, 50, 80, 95, 90, 65);
        setType(Type.PSYCHIC);
        setMove(new Facade(), new DoubleTeam(), new Swagger(), new Pin_Missile());
    }
}
