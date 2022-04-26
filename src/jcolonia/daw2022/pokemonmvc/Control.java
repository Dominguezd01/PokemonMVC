package jcolonia.daw2022.pokemonmvc;
import java.util.ArrayList;
import java.util.Scanner;



import static java.lang.System.out;
import static java.lang.System.err;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Se encarga de gestionar y organizar el funcionamiento de todo el programa.
 */
public class Control{
	Conjunto conjuntoPokemons;
    private static String nombre_archivo = "Nombres.txt";
    private Scanner in; 
    
    public Control(Scanner in){
        this.in = in;
       conjuntoPokemons = new Conjunto();
    }
    
    /**
     * Ejecuta el método encargado de mostrar el menu y mediante la entrada por teclado permite al usuario acceder a las diferentes opciones del programa.
     * @throws IOException
     * @throws InterruptedException
     */
    public void buclePrincipal() throws IOException, InterruptedException{
        VistaMatriz matriz = new VistaMatriz(in);
        boolean salir = false;
        String [] textoOpciones = {"1. Introducir Pokemons ", "2. Visualizar Pokemons ", "3. Importar Pokemons ","4. Exportar Pokemons" ,"0. Salir"};
        VistaMenú menú = new VistaMenú(matriz.getEntrada(), textoOpciones);
        while(!salir){
            menú.mostrarMenú();
            switch(menú.pedirOpción()){
                case 0:
                    out.println("Saliendo...");
                    salir = true;
                break;

                case 1:
                    gestiónAltas();
                break;

                case 2:
                    gestiónListado();
                break;

                case 3:
                    //importarNombres();
                break;

                case 4:
                    //exportarNombres();
                break;
            }
        }
    }

    /**
     * Se encarga de gestionar las altas llamando a la clase "VistaAltas".
     */
    public void gestiónAltas(){
        VistaMatriz matriz = new VistaMatriz(in);
        VistaAltas altas = new VistaAltas(matriz.getEntrada());

        
        Pokemon pokemonVacío = new Pokemon();
        
        altas.cargarPokemon(pokemonVacío);
        
        
        conjuntoPokemons.añadir(pokemonVacío);
    }

    /**
     * Muestra los listados que haya guardados.
     * @throws InterruptedException
     */
    public void gestiónListado() throws InterruptedException{
        VistaMatriz matriz = new VistaMatriz(in);
        VistaListado listado = new VistaListado(matriz.getEntrada());
        
        listado.mostrarListado(conjuntoPokemons.listaPokemons);
        Thread.sleep(500);
    }

    /**
     * Realiza un volcado del texto que haya en el archivo indicado por el usuario al ArrayList listaNombres declarado arriba.
     * @throws IOException
     
    public void importarNombres() throws IOException{
        out.println("Introduce el nombre del archivo a importar\n");
        nombre_archivo = in.nextLine();
        out.println("Importando...\n");
        try(FileReader archivo = new FileReader(nombre_archivo)){
            String texto = "";
            Scanner importador = new Scanner(archivo);
           while(importador.hasNextLine()){
                texto = importador.nextLine();
                listaPokemons.add(texto);
            } 
            importador.close();
            out.println("Importado correctamente.\n");
        }catch(FileNotFoundException e){
            err.println("Archivo no encontrado\n");
        }
       
    }
    */


    /**
     * Realiza el volcado del listado a un archivo, con un nombre elegido por el usuario previamente.
     *
    public void exportarNombres() throws FileNotFoundException{
        out.println("Indica el nombre del archivo al que quieres exportar los nombres\n");
        nombre_archivo =  in.nextLine();
        out.println("Exportando...\n");
        try(PrintWriter salida = new PrintWriter(nombre_archivo)){ 
            for (String texto:listaPokemons){
                salida.println(texto);
            }
            out.println("Exportado\n");
        }catch(FileNotFoundException e){
            err.printf("Archivo no encontrado\n", e.getLocalizedMessage());
        }
	}
    */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        Control bucle = new Control(in);
        bucle.buclePrincipal();
    }
}

