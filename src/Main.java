import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPersonas gestion = new GestionPersonas();
        ArrayList<Usuario> usuarios = gestion.capturarUsuario(scanner);


        System.out.println("\n--- Datos Capturados ---");
        gestion.mostrar_Nombre_Y_Genero(usuarios);

    }