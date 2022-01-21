package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fire_Punch extends PhysicalMove {

    public Fire_Punch() {
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.01) {
            Effect.burn(p);
        }
    }
    @Override
    protected String describe() {
        return ("is using Fire_Punch");
    }
}
