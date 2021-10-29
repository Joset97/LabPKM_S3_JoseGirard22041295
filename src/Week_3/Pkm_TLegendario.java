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
public class Pkm_TLegendario extends Pokemon {
    
    
   private int tipo, NOdeVidas,VidaTemp ;

    public Pkm_TLegendario(int NOdeVidas, String nombre, int atk, int vida) {
        super(nombre, atk, vida);
        this.tipo = 4;
        this.NOdeVidas = NOdeVidas;
        this.VidaTemp=vida;
    }

    public int getNOdeVidas() {
        return NOdeVidas;
    }

    public void setNOdeVidas(int NOdeVidas) {
        this.NOdeVidas = NOdeVidas;
    }
   
    
public void ventajaL(){
    
super.vida= vida*NOdeVidas;

}
    
}
