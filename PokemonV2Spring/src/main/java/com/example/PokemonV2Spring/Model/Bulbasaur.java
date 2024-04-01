package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Grass;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bulbasaur extends Grass {
    public Bulbasaur(Bulbasaur bulbasaur){
        if(bulbasaur!=null) {
            this.setName(bulbasaur.getName());
            this.setHealth(bulbasaur.getHealth());
            this.setAttack(bulbasaur.getAttack());
            this.setDefence(bulbasaur.getDefence());
            bulbasaur.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Bulbasaur(this);
    }
}
