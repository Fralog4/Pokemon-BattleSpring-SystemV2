package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Fire;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Charizard extends Fire {
    public Charizard(Charizard charizard){
        if(charizard!=null) {
            this.setName(charizard.getName());
            this.setHealth(charizard.getHealth());
            this.setAttack(charizard.getAttack());
            this.setDefence(charizard.getDefence());
            charizard.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Charizard(this);
    }

}
