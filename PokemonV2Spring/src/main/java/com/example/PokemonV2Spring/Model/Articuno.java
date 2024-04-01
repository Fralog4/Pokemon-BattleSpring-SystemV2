package com.example.PokemonV2Spring.Model;
import com.example.PokemonV2Spring.ModelTypes.Ice;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Articuno extends Ice {

    public Articuno(Articuno articuno){
        if(articuno!=null) {
            this.setName(articuno.getName());
            this.setHealth(articuno.getHealth());
            this.setAttack(articuno.getAttack());
            this.setDefence(articuno.getDefence());
            articuno.isAlive = true;
        }
    }
    @Override
    public Pokemon clone() {
        return new Articuno(this);
    }
}
