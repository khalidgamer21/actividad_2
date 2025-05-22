import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    public Usuario(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    public String getApellido() {
        return apellido;
    }


}
