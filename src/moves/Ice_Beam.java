package moves;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Ice_Beam extends SpecialMove {
    public Ice_Beam() {
        super(Type.ICE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.01) {
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe() {
        return ("is using Ice_Beam");
    }
}
