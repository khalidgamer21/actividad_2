public class GestionPersonas {
    public ArrayList<Usuario> capturarUsuario(Scanner scanner) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

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
            usuarios.add(new Usuario(nombre, apellido, genero, edad));
            System.out.println();
        }

        return Usuarios;
    }


}

public void mostrar_Nombre_Y_Genero(ArrayList<Usuario> usuarios) {
    for (Usuario p : usuarios) {
        System.out.println("Nombre completo: " + p.getNombre() + " " + p.getApellido()
                + " | Género: " + p.getGenero());
    }
}
