/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class CordinadorPKM extends Entrenador {

    private ArrayList<Pokemon> pkms;

    public CordinadorPKM(String nombre, int Edad, boolean sexo) {
        super(nombre, Edad, sexo);
        this.pkms = new ArrayList();
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
                    pkms.add(new Pkm_TipoFuego(name, atk, vida));

                    break;
                case (2):
                    pkms.add(new Pkm_TipoPlanta(name, atk, vida));

                    break;
                case (3):
                    pkms.add(new Pkm_TipoAgua(name, atk, vida));

                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }

            System.out.println("Quieres agregar otro?\n"
                    + "1.SI\n"
                    + "2.NO");

            int res;
            res = read.nextInt();
            if (res == 1) {

            }else{seleccionado=true;}

        }
    }

}
