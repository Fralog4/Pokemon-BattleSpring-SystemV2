package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Rock;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Geodude extends Rock {
    public Geodude(Geodude geodude) {
        if(geodude!=null) {
            this.setName(geodude.getName());
            this.setHealth(geodude.getHealth());
            this.setAttack(geodude.getAttack());
            this.setDefence(geodude.getDefence());
            geodude.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Geodude(this);
    }

}
