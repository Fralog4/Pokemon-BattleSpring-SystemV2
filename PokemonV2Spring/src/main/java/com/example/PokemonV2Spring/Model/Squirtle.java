package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Water;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Squirtle extends Water {
    public Squirtle(Squirtle squirtle) {
        if(squirtle!=null) {
            this.setName(squirtle.getName());
            this.setHealth(squirtle.getHealth());
            this.setAttack(squirtle.getAttack());
            this.setDefence(squirtle.getDefence());
            squirtle.isAlive = true;
        }
    }

    @Override
    public Pokemon clone() {
        return new Squirtle(this);
    }
}
