package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Dragon;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Rayquaza extends Dragon {
    public Rayquaza(Rayquaza rayquaza) {
        if(rayquaza!=null) {
            this.setName(rayquaza.getName());
            this.setHealth(rayquaza.getHealth());
            this.setAttack(rayquaza.getAttack());
            this.setDefence(rayquaza.getDefence());
            rayquaza.isAlive = true;
        }
    }

    @Override
    public Pokemon clone() {
        return new Rayquaza(this);
    }

}
