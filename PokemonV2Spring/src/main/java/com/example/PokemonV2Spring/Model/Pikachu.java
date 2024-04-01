package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Electric;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pikachu extends Electric {

    public Pikachu(Pikachu pikachu){
        if(pikachu!=null) {
            this.setName(pikachu.getName());
            this.setHealth(pikachu.getHealth());
            this.setAttack(pikachu.getAttack());
            this.setDefence(pikachu.getDefence());
            pikachu.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Pikachu(this);
    }

}
