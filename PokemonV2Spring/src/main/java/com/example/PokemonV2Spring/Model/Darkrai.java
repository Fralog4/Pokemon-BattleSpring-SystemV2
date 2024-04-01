package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Dark;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Darkrai extends Dark {

    public Darkrai(Darkrai darkrai){
        if(darkrai!=null){
            this.setName(darkrai.getName());
            this.setHealth(darkrai.getHealth());
            this.setAttack(darkrai.getAttack());
            this.setDefence(darkrai.getDefence());
            darkrai.isAlive=true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Darkrai(this);
    }
}
