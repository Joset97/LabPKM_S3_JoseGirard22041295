/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

/**
 *
 * @author jrgir
 */
public class Pkm_TipoAgua extends Pokemon{
    
    private int tipo;

    public Pkm_TipoAgua(String nombre, int atk, int vida) {
        super(nombre, atk, vida);
        this.tipo = 3;
    }
    
    public void VentajaCF(){
    
    super.atk=(int) (atk*1.5);
    
    }
    
}
