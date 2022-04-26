package jcolonia.daw2022.pokemonmvc;

import java.util.ArrayList;
import java.util.Scanner;



import static java.lang.System.out;
public class Conjunto{
    ArrayList <Pokemon> listaPokemons = new ArrayList<Pokemon>();
    Scanner sc = new Scanner(System.in);
    public Conjunto(ArrayList <Pokemon> conjuntoPokemons){
    	this.listaPokemons = conjuntoPokemons;
    }
    public Conjunto() {
    	
    }
    /**
     * 
     * @param nuevoPokemon
     */
    public void añadir(Pokemon pokemonVacío){ //Pendiente, creo
        if(pokemonVacío == null){
            out.println("catapimbas");
        }else{
            
            listaPokemons.add(pokemonVacío);
            }
          
        }
    


    public String consultar(int posición){ //Pendiente, cre
        String imprimir ="";
        imprimir += listaPokemons.get(posición).getNombre().toString()+"\t";
        imprimir += listaPokemons.get(posición).getTipo1().toString()+"\t";
        imprimir += listaPokemons.get(posición).getTipo2().toString()+"\n";
        return imprimir;  
    }

  

 
}
    



