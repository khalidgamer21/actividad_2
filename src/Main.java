import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion_Usuario gestion = new Gestion_Usuario();

        ArrayList<Usuario> usuarios = gestion.capturarUsuario(scanner);

        System.out.println("\n---- Datos Capturados ----");
        gestion.mostrar_Nombre_Y_Genero(usuarios);

        System.out.printf("\nPromedio de edades: %.2f\n", gestion.calcular_Promedio_Edad(usuarios));
        System.out.println("Cantidad de personas con género Masculino: " + gestion.contar_Masculinos(usuarios));
        System.out.println("Cantidad de personas con género Femenino: " + gestion.contar_Femeninos(usuarios));
    }
}
