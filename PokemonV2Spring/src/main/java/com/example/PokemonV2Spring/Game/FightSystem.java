package com.example.PokemonV2Spring.Game;

import com.example.PokemonV2Spring.Model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;

public class FightSystem {
    @Autowired
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private int round;

    public FightSystem(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.round = 1;
    }

    public static void startFight(Pokemon pokemon1, Pokemon pokemon2) {
        FightSystem fightSystem = new FightSystem(pokemon1, pokemon2);
        fightSystem.startFight();
    }

    public void startFight() {
        System.out.println("***Fight is about to start!***");
        System.out.println("Pokemon involved in fighting are... ");
        System.out.println(pokemon1.getName());
        System.out.println("and");
        System.out.println(pokemon2.getName());
        while (!isFinished()) {
            System.out.println("***Round " + round + " starts***");
           // System.out.println("Attack from " + pokemon2.getName() + " " + pokemon2.getAttack());
            //System.out.println("Defend " + pokemon1.getName() + " " + pokemon1.getDefence());
            //System.out.println(pokemon1.getName() + " has " + pokemon1.getHealth() + " health points now!");
            AttackAndDefend(pokemon1, pokemon2);
            nextRound();
        }
        endFight();
    }

    public void endFight() {
        System.out.println("***Fight is done!***");
        System.out.println("The winner is :");
        System.out.println(getWinner());
        System.exit(0);
    }

    public void nextRound() {
        if (!isFinished()) {
            round++;
        }
    }

    public boolean isFinished() {
        return !pokemon1.checkLife(pokemon1.getHealth()) || !pokemon2.checkLife(pokemon2.getHealth());  //this determines when the battle is done, when one of them isn't alive anymore
    }

    public Pokemon getWinner() {
        if (pokemon1.checkLife(pokemon1.getHealth())) {
            return pokemon1;
        } else {
            return pokemon2;
        }
    }

    public void AttackAndDefend(Pokemon pokemon1, Pokemon pokemon2) {
        // Round 1: Pokemon 1 attacks Pokemon 2
        int damageDealtToPokemon2 = calculateDamage(pokemon1, pokemon2);
        pokemon2.setHealth(Math.max(pokemon2.getHealth() - damageDealtToPokemon2, 0));  // Ensure health doesn't go negative
        System.out.println(pokemon1.getName() + " attacks " + pokemon2.getName() + " for " + damageDealtToPokemon2 + " damage!");
        System.out.println(pokemon2.getName() + " has " + pokemon2.getHealth() + " health points now!");
        nextRound();

        if (pokemon2.checkLife(pokemon2.getHealth())) {
            // Round 2: Pokemon 2 attacks Pokemon 1 (if not fainted)
            int damageDealtToPokemon1 = calculateDamage(pokemon2, pokemon1);
            pokemon1.setHealth(Math.max(pokemon1.getHealth() - damageDealtToPokemon1, 0));  // Ensure health doesn't go negative
            System.out.println(pokemon2.getName() + " attacks " + pokemon1.getName() + " for " + damageDealtToPokemon1 + " damage!");
            System.out.println(pokemon1.getName() + " has " + pokemon1.getHealth() + " health points now!");
        } else {
            System.out.println(pokemon2.getName() + " has fainted!");
        }
    }

    private int calculateDamage(Pokemon attacker, Pokemon defender) {
        int damage = attacker.getAttack() - defender.getDefence();
        if (damage <= 0) {
            attacker.setHealth(0); //Setting health to 0? Curious, aren't we? Check the `getWinner()` method
            System.out.println("The defence of " + defender.getName() + " is too high for " + attacker.getName() + " attack!");
            System.out.println("***"+attacker.getName()+" runs away!***");
            endFight();
            return 0;
        } else {
            return damage;
        }
    }
}