package com.example.PokemonV2Spring.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public abstract class Pokemon {

    public boolean isAlive;
    private String name;
    private int health;
    private int attack;
    private int defence;

    public Pokemon(Pokemon pokemon) {
        if (pokemon != null) {
            this.name = pokemon.name;
            this.health = pokemon.health;
            this.attack = pokemon.attack;
            this.defence = pokemon.defence;
            pokemon.isAlive = true;
        }
    }

    public boolean checkLife(int health) {
        if (health <= 0) {
            isAlive = false;
            return false;
        } else {
            isAlive = true;
            return true;
        }
    }

    public abstract Pokemon clone();
    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //
        if (!(obj instanceof Pokemon)) return false; //
        Pokemon other = (Pokemon) obj;
        return name.equals(other.name);
    }
}
