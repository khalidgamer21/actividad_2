import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion_Persona gestion = new Gestion_Persona();

        ArrayList<Persona> personas = gestion.capturarPersonas(scanner);

        System.out.println("\n---- Datos Capturados ----");
        gestion.mostrarInformacionPersonas(personas);

        System.out.printf("\nPromedio de edades: %.2f\n", gestion.calcularPromedioEdad(personas));
        System.out.println("Cantidad de personas con género Masculino: " + gestion.contar_Masculinos(personas));
        System.out.println("Cantidad de personas con género Femenino: " + gestion.contar_Femeninos(personas));
    }
}