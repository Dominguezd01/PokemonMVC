package jcolonia.daw2022.pokemonmvc;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class VistaListado extends VistaMatriz {
	

	public VistaListado(Scanner sc) {
		super(sc);
	}

	/**
	 * Muestra el contenido de listaNombres
	 * 
	 * @param listaPokemons
	 */
	public void mostrarListado(ArrayList <Pokemon> listaPokemon) {
		Conjunto conjuntoPokemons = new Conjunto(listaPokemon);
		
			out.println("Listado:");
			out.println("---------------");
			for(int i=0;i < conjuntoPokemons.listaPokemons.size();i++){
				out.printf("%s%n",conjuntoPokemons.consultar(i));
			}

			out.println("---------------\n");
		}

}

