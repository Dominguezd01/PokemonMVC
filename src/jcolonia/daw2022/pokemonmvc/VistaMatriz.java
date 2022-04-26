package jcolonia.daw2022.pokemonmvc;

import java.util.Scanner;

public class VistaMatriz {

	private Scanner sc;

	public VistaMatriz(Scanner sc) {
		this.sc = sc;
	}

	public static void mostrarTexto(String texto) {
		System.out.println(texto);
	}

	public Scanner getEntrada() {
		return sc;
	}
	
}
