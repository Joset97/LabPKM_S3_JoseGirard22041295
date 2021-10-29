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
public class Pokemon {
    
    protected String nombre;
    protected  int atk;
    protected int vida;

    public Pokemon(String nombre, int atk, int vida) {
        this.nombre = nombre;
        this.atk = atk;
        this.vida = vida;
    }

    public Pokemon() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        
        if(atk>=100 && atk<=200){
        this.atk = atk;
    }else{System.out.println(" Valor Erroneo");}
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        
        if(vida>=200 && vida<=500){
        this.vida = vida;
    }else{System.out.println(" Valor Erroneo");}
    }
    
}
