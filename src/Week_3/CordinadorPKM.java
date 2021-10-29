/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

import java.util.ArrayList;

/**
 *
 * @author jrgir
 */
public class CordinadorPKM extends Entrenador{
    
    private ArrayList <Pokemon> pkms;

    public CordinadorPKM(String nombre, int Edad, boolean sexo) {
        super(nombre, Edad, sexo);
        this.pkms = new ArrayList();
    }
    
    
}
