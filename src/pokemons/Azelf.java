package pokemons;
import moves.Facade;
import moves.Force_Palm;
import moves.Low_Sweep;
import moves.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azelf extends Pokemon {
    public Azelf(String name, int level) {
        super(name, level);
        setStats(75, 125, 70, 125, 70, 115);
        setType(Type.PSYCHIC);
        addMove(new Facade());
        addMove(new Force_Palm());
        addMove(new Low_Sweep());
        addMove(new Tackle());

    }
}
