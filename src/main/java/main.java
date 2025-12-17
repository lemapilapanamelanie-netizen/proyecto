import entities.alumnos;

public class main {
    public static void main(String[] args) {
        alumnos  alumno1 = new alumnos ();
        alumno1.setNombre("Olivia");
        alumno1.setApellido("Perez");
        alumno1.setEdad(20);
        alumno1.setCurso("2º DAW");
        alumno1.setDni("4567289A");
        alumno1.setEmail("olivida.perez@gmail.com");
        alumno1.setTelefono("678912345");
        alumno1.setNotamedia(8.5);
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Apellido: " + alumno1.getApellido());
        System.out.println("Edad: " + alumno1.getEdad());
        System.out.println("Curso: " + alumno1.getCurso());
        System.out.println("DNI: " + alumno1.getDni());
        System.out.println("Email: " + alumno1.getEmail());
        System.out.println("Telefono: " + alumno1.getTelefono());
        System.out.println("Nota Media: " + alumno1.getNotamedia());
      // constructor con todos los parametros
        alumnos  alumno2 = new alumnos ("Liam", "Garcia", 22, "1º DAW", "7894561B","liam.garcia@email.com","612345678", 9.0);
     // metodos estaticos
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());
        System.out.println("Edad: " + alumno2.getEdad());
        System.out.println("Curso: " + alumno2.getCurso());
        System.out.println("DNI: " + alumno2.getDni());
        System.out.println("Email: " + alumno2.getEmail());
        System.out.println("Telefono: " + alumno2.getTelefono());
        System.out.println("Nota Media: " + alumno2.getNotamedia());
    }
}
