package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public  class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status d = def.getCondition();
        if(d.equals(Status.BURN) || d.equals(Status.PARALYZE) || d.equals(Status.POISON)){
            super.applyOppDamage(def, damage*2);
        }

    }
    @Override
    protected String describe(){
        return  "is using facade";
    }

}