package com.example.PokemonV2Spring.PokeLoader;

import com.example.PokemonV2Spring.Game.FightSystem;
import com.example.PokemonV2Spring.Model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Random;
import java.util.ArrayList;

@Component
public class PokeLoader implements CommandLineRunner {

    private Pokemon pokemon;
    private Lucario lucario=new Lucario();
    private Articuno articuno=new Articuno();
    private Bulbasaur bulbasaur=new Bulbasaur();
    private Charizard charizard=new Charizard();
    private Geodude geodude=new Geodude();
    private Darkrai darkrai=new Darkrai();
    private Pidgeot pidgeot=new Pidgeot();
    private Pikachu pikachu=new Pikachu();
    private Squirtle squirtle=new Squirtle();
    private Rayquaza rayquaza=new Rayquaza();

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Pokemon> pokemonTeam = new ArrayList<>();

        articuno.setName("Articuno");
        articuno.setHealth(90);
        articuno.setDefence(100);
        articuno.setAttack(85);
        articuno.setAlive(true);

        bulbasaur.setName("Bulbasaur");
        bulbasaur.setHealth(45);
        bulbasaur.setDefence(49);
        bulbasaur.setAttack(49);
        bulbasaur.setAlive(true);

        charizard.setName("Charizard");
        charizard.setHealth(78);
        charizard.setDefence(78);
        charizard.setAttack(84);
        charizard.setAlive(true);

        darkrai.setName("Darkrai");
        darkrai.setHealth(70);
        darkrai.setDefence(90);
        darkrai.setAttack(90);
        darkrai.setAlive(true);

        geodude.setName("Geodude");
        geodude.setHealth(40);
        geodude.setDefence(100);
        geodude.setAttack(80);
        geodude.setAlive(true);

        lucario.setName("Lucario");
        lucario.setHealth(70);
        lucario.setDefence(70);
        lucario.setAttack(110);
        lucario.setAlive(true);

        pidgeot.setName("Pidgeot");
        pidgeot.setHealth(83);
        pidgeot.setDefence(75);
        pidgeot.setAttack(80);
        pidgeot.setAlive(true);

        pikachu.setName("Pikachu");
        pikachu.setHealth(35);
        pikachu.setDefence(40);
        pikachu.setAttack(55);
        pikachu.setAlive(true);

        rayquaza.setName("Rayquaza");
        rayquaza.setHealth(105);
        rayquaza.setDefence(90);
        rayquaza.setAttack(150);
        rayquaza.setAlive(true);

        squirtle.setName("Squirtle");
        squirtle.setHealth(44);
        squirtle.setDefence(65);
        squirtle.setAttack(48);
        squirtle.setAlive(true);

        pokemonTeam.add(articuno);pokemonTeam.add(bulbasaur);
        pokemonTeam.add(charizard);pokemonTeam.add(darkrai);
        pokemonTeam.add(geodude);pokemonTeam.add(lucario);
        pokemonTeam.add(pidgeot);pokemonTeam.add(pikachu);
        pokemonTeam.add(rayquaza);pokemonTeam.add(squirtle);

        Random random = new Random();
        int randomIndex = random.nextInt(pokemonTeam.size());
        Pokemon pokemon1 = pokemonTeam.get(randomIndex);

        while (true) {
            randomIndex = random.nextInt(pokemonTeam.size());
            Pokemon pokemon2 = pokemonTeam.get(randomIndex);
            if (!pokemon1.equals(pokemon2)) {
                FightSystem.startFight(pokemon1, pokemon2);
                break; // Exit loop if different Pokemon found
            }
        }
    }
}
