package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Flying;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pidgeot extends Flying {
    public Pidgeot(Pidgeot pidgeot){
        if(pidgeot!=null) {
            this.setName(pidgeot.getName());
            this.setHealth(pidgeot.getHealth());
            this.setAttack(pidgeot.getAttack());
            this.setDefence(pidgeot.getDefence());
            pidgeot.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Pidgeot(this);
    }

}
