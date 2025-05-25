import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_Persona {

    public ArrayList<Persona> capturarPersonas(Scanner scanner) {
        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas.add(new Usuario(nombre, apellido, genero, edad));
            System.out.println();
        }

        return personas;
    }

    public void mostrarInformacionPersonas(ArrayList<Persona> personas) {
        for (Persona p : personas) {
            p.mostrarInformacion(); // POLIMORFISMO
        }
    }

    public double calcularPromedioEdad(ArrayList<Persona> personas) {
        int suma = 0;
        for (Persona p : personas) {
            suma += p.getEdad();
        }
        return (double) suma / personas.size();
    }

    public int contar_Masculinos(ArrayList<Usuario> usuarios) {
        int count = 0;
        for (Usuario p : usuarios) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) {
                count++;
            }
        }
        return count;
    }

    public int contar_Femeninos(ArrayList<Usuario> usuarios) {
        int count = 0;
        for (Usuario p : usuarios) {
            if (p.getGenero().equalsIgnoreCase("Femenino")) {
                count++;
            }
        }
        return count;
    }
}
