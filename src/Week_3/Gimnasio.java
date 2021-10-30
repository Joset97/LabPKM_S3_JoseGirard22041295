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
public class Gimnasio {

    private String nombre, ciudad, lider;
    private int victorias, derrotas;
    private double dinero;
    private ArrayList<Entrenador> Trainer;

    static Scanner leer = new Scanner(System.in);

    public Gimnasio(String nombre, String ciudad, String lider, double dinero) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
        this.victorias = 0;
        this.derrotas = 0;
        this.dinero = dinero;
        Trainer = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void agregarTrainer(String nombre, int edad, boolean sexo) {
        boolean control = false;
        int TipoT = 0;
        if (Trainer.size() < 6) {
            while (control) {
                System.out.println("Que tipo de entrenador eres?");
                System.out.println("1.Entrenador novato"
                        + "\n2.Maestro Pokemon"
                        + "\n3.Cordinador Pokemon"
                        + "\n4.Entrenador LEGENDARIO");

                switch (TipoT) {
                    case (1):

                        System.out.println("Ingrese la cantidad de pokemon registrados en la pokedex");
                        int pokedex = leer.nextInt();

                        Trainer_Novato novato = new Trainer_Novato(pokedex, nombre, edad, sexo);

                        System.out.println("Ingrese el nombre de su pokemon");
                        String pkm = leer.next();
                        System.out.println("Ingrese su ataque (rango 100-200)");
                        int atk = leer.nextInt();
                        System.out.println("Ingrese su vida (rango 200-500)");
                        int vida = leer.nextInt();

                        novato.Setpokemon(pkm, atk, vida);
                        Trainer.add(novato);

                        break;

                    case (2):

                        System.out.println("Ingrese la cantidad de victorias ");
                        int vic = leer.nextInt();

                        Maestro_Pokemon PkmM = new Maestro_Pokemon(vic, nombre, edad, sexo);

                        System.out.println("Ingrese el nombre de su pokemon");
                        String Pkm = leer.next();
                        System.out.println("Ingrese su ataque (rango 100-200)");
                        int Atk = leer.nextInt();
                        System.out.println("Ingrese su vida (rango 200-500)");
                        int Vida = leer.nextInt();

                        PkmM.Setpokemon(Pkm, Atk, Vida);

                        Trainer.add(PkmM);

                        break;

                    case (3):

                        if (HasCordinador() == false) {

                            CordinadorPKM Cordinador = new CordinadorPKM(nombre, edad, sexo);

                            System.out.println("Ingrese el nombre de su pokemon");
                            String PKm = leer.next();
                            System.out.println("Ingrese su ataque (rango 100-200)");
                            int ATk = leer.nextInt();
                            System.out.println("Ingrese su vida (rango 200-500)");
                            int VIda = leer.nextInt();

                            Cordinador.Setpokemon(PKm, ATk, VIda);
                            Trainer.add(Cordinador);

                            break;
                        }

                    case (4):

                        if (HasLegend() == false) {

                            Entrenador_Legendario Legend = new Entrenador_Legendario(nombre, edad, sexo);

                            System.out.println("Ingrese el nombre de su pokemon");
                            String PKM = leer.next();
                            System.out.println("Ingrese su ataque (rango 100-200)");
                            int ATK = leer.nextInt();
                            System.out.println("Ingrese su vida (rango 200-500)");
                            int VIDa = leer.nextInt();

                            Legend.SetPokemon(PKM, ATK, VIDa);

                            Trainer.add(Legend);

                            break;
                        } else {
                            System.out.println("Ya existe un entrenador legendario");
                        }
                }
            }

        }
    }

    public boolean HasLegend() {

        for (Entrenador e : Trainer) {

            if (e instanceof Entrenador_Legendario) {

                return true;

            }

        }

        return false;
    }

    public boolean HasCordinador() {

        int control = 0;
        for (Entrenador e : Trainer) {

            if (e instanceof CordinadorPKM) {
                control++;

                if (control == 2) {
                    return true;
                }
            }

        }

        return false;
    }

    public void quitarEntrenador(){
   int control=0;
        System.out.println("Que entrenador quiere quitar");
        for (Entrenador entrenador : Trainer) {
            
            System.out.println(control +"\t"+ entrenador);
            control++;
        }
        
    int control1 =leer.nextInt();
    
    Trainer.remove(control1);
    
    }
    
    
    public double WinRate() {

        int TotalBatallas = victorias + derrotas;
        double winR = victorias / derrotas * 100;

        return winR;
    }

    @Override
    public String toString() {
        return "Gimnacio{" + "nombre=" + nombre
                + ", \nciudad=" + ciudad
                + ", \nvictorias=" + victorias
                + ", \nderrotas=" + derrotas
                + ", \n % de victorias" + WinRate()
                + ", \ndinero=" + dinero;
    }

}
