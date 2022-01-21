package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Force_Palm extends PhysicalMove {

    public Force_Palm() {
        super(Type.FIGHTING, 60d, 100d);
    }
    public  static  boolean change(double d){
        return  d > Math.random();
    }
    @Override
    protected  void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(change(0.3)){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return  "is using Force Palm";
    }
}
