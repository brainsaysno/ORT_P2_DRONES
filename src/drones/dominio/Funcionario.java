package drones.dominio;
/**
 *
 * @author Nicolas Russo
 * @author Francisco Suarez 
 */
public class Funcionario {
    private String nombre;
    private int edad; 
    private int numero;

    public Funcionario(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
}
