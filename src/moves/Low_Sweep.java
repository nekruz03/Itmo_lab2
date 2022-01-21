package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Low_Sweep extends PhysicalMove {

    public Low_Sweep() {

        super(Type.FIGHTING, 60.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        super.applyOppEffects(pokemon);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        int currentStat = (int) p.getStat(Stat.EVASION);
        if (currentStat < 6) {
            p.setMod(Stat.EVASION, ++currentStat);
        }
    }
    @Override
    protected String describe() {
        return ("is using Low_Sweep");
    }

}
