package Week_3;

import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class Trainer_Novato extends Entrenador {

    //pokemon descubiertos
    private int pokedex;
    //pokemon 
    private Pokemon pkm;

    public Trainer_Novato(int pokedex, String nombre, int Edad, boolean sexo) {
        super(nombre, Edad, sexo);
        this.pokedex = pokedex;
        pkm = new Pokemon();
    }

    public void Setpokemon(String name, int atk, int vida) {

        Scanner read = new Scanner(System.in);
        boolean seleccionado = false;

        while (seleccionado) {
            int Tipo = read.nextInt();

            switch (Tipo) {
                case (1):
                    pkm = new Pkm_TipoFuego(name, atk, vida);
                    seleccionado = true;
                    break;
                case (2):
                    pkm = new Pkm_TipoPlanta(name, atk, vida);
                    seleccionado = true;
                    break;
                case (3):
                    pkm = new Pkm_TipoAgua(name, atk, vida);
                    seleccionado = true;
                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }

        }
    }

    public int getPokedex() {
        return pokedex;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    public Pokemon getPkm() {
        return pkm;
    }

}
