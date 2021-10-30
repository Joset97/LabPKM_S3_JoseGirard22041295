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
public class Battle {
    
    public static void main(String[] args) {
        
       ArrayList <Gimnasio> Gym = new ArrayList();
       Scanner leer = new Scanner(System.in);
       int control=0; 
       
        do{
            
            System.out.println("Que desea hacer?");
            System.out.println("1.Acceder a Gym"
                    + "2.luchar"
                    + "3.salir"
            );         
                    control=leer.nextInt();
           
            
        }while(control!=3);
        
                }
    }

