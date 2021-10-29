
package Week_3;

/**
 *
 * @author jrgir
 */
public class Entrenador {
    
    protected String nombre;
    protected int Edad;
    protected boolean sexo;


    public Entrenador(String nombre, int Edad, boolean sexo) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
