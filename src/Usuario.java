public class Usuario extends  Persona {
    public Usuario(String nombre, String apellido, String genero, int edad) {
        super(nombre, apellido, genero, edad);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Género: " + getGenero());
        System.out.println("Edad: " + getEdad());
    }

}
