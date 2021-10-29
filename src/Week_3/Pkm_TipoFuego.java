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
public class Pkm_TipoFuego extends Pokemon {
    
    private int Tipo;

    public Pkm_TipoFuego( String nombre, int atk, int vida) {
        super(nombre, atk, vida);
        this.Tipo = 1;
    }
    
    
    public void VentajaCP(){
    
    super.atk = (int) (atk*1.35);
        
    }
    
    
}
