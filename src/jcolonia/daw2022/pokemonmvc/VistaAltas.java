package jcolonia.daw2022.pokemonmvc;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaAltas extends VistaMatriz {

	public VistaAltas(Scanner sc) {
		super(sc);
	}

	public void cargarPokemon(Pokemon pokemonVacio) {
		String líneaTexto;
		boolean masTipos = false;
		
		out.println("Introduce el Nombre del Pokemon\n");
		líneaTexto = getEntrada().nextLine();
		pokemonVacio.setNombre(líneaTexto);

		mostrarTexto("Introduce el tipo");
		líneaTexto = getEntrada().nextLine();
		pokemonVacio.setTipo1(líneaTexto);

		while (!masTipos) {
			mostrarTexto("Si tiene otro tipo, escribe 'Si', si solo tiene un tipo, escribe 'No'");
			líneaTexto = getEntrada().nextLine();

			if (líneaTexto.equals("si") || líneaTexto.equals("Si") || líneaTexto.equals("SI")
					|| líneaTexto.equals("sI") || líneaTexto.equals("sí") || líneaTexto.equals("Sí")
					|| líneaTexto.equals("sÍ") || líneaTexto.equals("SÍ")) {

				mostrarTexto("Introduce el segundo tipo");
				líneaTexto = getEntrada().nextLine();
				pokemonVacio.setTipo2(líneaTexto);
				masTipos = true;
			} else if (líneaTexto.equals("no") || líneaTexto.equals("No") || líneaTexto.equals("NO")
					|| líneaTexto.equals("nO")) {

				masTipos = true;
				out.printf("%s%n", "Pokemon añadido correctamente\n");
			}
			
		}
		
	}	
}
