package jcolonia.daw2022.pokemonmvc;

import java.util.Scanner;

import static java.lang.System.out;

public class VistaMenú extends VistaMatriz{

	private String [] textoOpciones;
	
	public VistaMenú(Scanner sc, String [] textoOpciones) {
		super(sc);
		this.textoOpciones = textoOpciones;
	}
	
	public void mostrarMenú() {
		out.println("Elige una opción");
		out.println("----------------------------------------\n");
		for (int i = 0; i < textoOpciones.length; i++) {
			out.printf("%s%n", textoOpciones[i]);
		}
		out.println("");
		out.println("----------------------------------------\n");
		
	}
	
	public int pedirOpción() {
		String lineaTexto;
		int número = 0;

		boolean numEsCorrecto = false;

		out.println("Introduce la opcion del menu elegida.\n");
		while (!numEsCorrecto) {
			try {
				lineaTexto = getEntrada().nextLine();
				número = Integer.parseInt(lineaTexto);
				if (número < 0 || número > textoOpciones.length) {
					out.println("No ha elegido una opcion valida.\n");
					throw new NumberFormatException("Valor introducido fuera de rango de opciones.\n");
				} else {
					numEsCorrecto = true;
				}
			} catch (NumberFormatException ex) {
				out.printf("\tNo es una de las opciones validas: �%s�%n", ex.getMessage());
			}
		}

		return número;
	}

}

