package com.company;
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
public class Main {

    public static void main(String[] args) {te
        Battle b = new Battle();
        Azelf p1 = new Azelf("Sasha", 1);
        Chimecho p2 = new Chimecho("Ali", 1);
        Shelgon p3 = new Shelgon ("Ahmed", 1);
        Chingling p4 = new Chingling("Kiril", 1);
        Bagon p5 = new Bagon("Islam", 1);
        Salamence p6 = new Salamence("Katia", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
