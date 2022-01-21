package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pin_Missile extends PhysicalMove {
        public Pin_Missile(){
            super(Type.BUG,25.0,95.0,1,1);
        }
        @Override
    protected String describe() {
        return ("is using Pin_Missile");
    }
}

