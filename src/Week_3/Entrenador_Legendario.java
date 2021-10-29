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
public class Entrenador_Legendario extends Entrenador {
    
    private Pokemon PkmL;

    public Entrenador_Legendario (String nombre, int Edad, boolean sexo) {
        super(nombre, Edad, sexo);
        this.PkmL = new Pokemon();
    }
    
    public void SetPokemon(String name , int atk , int vida ){
    
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vidas");
        int lives = read.nextInt();
        
        PkmL = new Pkm_TLegendario(lives,name, atk , vida);
    
    
    
    }

    public Pokemon getPkmL() {
        return PkmL;
    }


    
    
}
