package com.example.PokemonV2Spring.Model;

import com.example.PokemonV2Spring.ModelTypes.Fight;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Lucario extends Fight {
    public Lucario(Lucario lucario) {
        if (lucario != null) {
            this.setName(lucario.getName());
            this.setHealth(lucario.getHealth());
            this.setAttack(lucario.getAttack());
            this.setDefence(lucario.getDefence());
            lucario.isAlive = true;
        }
        //lucario.setName("Lucario");
    }

    @Override
    public Pokemon clone() {
        return new Lucario(this);
    }
}
