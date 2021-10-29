/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class Maestro_Pokemon extends Entrenador{
 
    private int Victorias;
    private Pokemon pkm;

    public Maestro_Pokemon(int Victorias, String nombre, int Edad, boolean sexo) {
        super(nombre, Edad, sexo);
        this.Victorias = Victorias;
        this.pkm = new Pokemon();
    }

    public int getVictorias() {
        return Victorias;
    }

    public void setVictorias(int Victorias) {
        this.Victorias = Victorias;
    }

    public Pokemon getPkm() {
        return pkm;
    }

    
     public void Setpokemon(String name, int atk, int vida) {

        Scanner read = new Scanner(System.in);
        boolean seleccionado = false;

        while (seleccionado) {
            int Tipo;
            System.out.println("Seleccione el tipo:\n"
                    + "1.Fuego\n"
                    + "2.Planta\n"
                    + "3.Agua\n");
            Tipo = read.nextInt();

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
     
     
     
     
}

