package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Charge_Beam extends SpecialMove {
    public Charge_Beam() {
        super(Type.ELECTRIC, 50, 90);
    }
    protected void applySelfEffects(Pokemon p) {
        int currentStat = (int) p.getStat(Stat.EVASION);
        if (currentStat < 6) {
            p.setMod(Stat.EVASION, ++currentStat);
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {

        return true;
    }
    @Override
    protected String describe() {
        return ("is using Charge_Beam");
    }
}
