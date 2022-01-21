package pokemons;

import moves.DoubleTeam;
import moves.Facade;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chingling extends Pokemon {
    public Chingling(String name, int level) {
        super(name, level);
        setStats(45, 30, 50, 65, 50, 45);
        setType(Type.PSYCHIC);
        addMove(new Facade());
        addMove(new DoubleTeam());
        addMove(new Swagger());
    }
}
