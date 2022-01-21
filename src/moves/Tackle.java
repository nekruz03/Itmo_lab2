
package moves;
import ru.ifmo.se.pokemon.*;
public class Tackle extends PhysicalMove {
    public Tackle() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
    }
    @Override
    protected String describe() {
        return "is using Tackle";
    }
}