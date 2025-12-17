package entities;

/** definición de la clase Alumnos */
public class Alumnos {
    /** atributos de la clase Alumnos */
    private  String Nombre;
    private String Apellido;
    private int Edad;
    private String Curso;
    private String Dni;
    private String Email;
    private String Telefono;
    private double Notamedia;
 /**  constructor vacio */
    public Alumnos() {
    }
 /** constructor con todos los parametros
  * @param Nombre nombre del alumno
  * @param Apellido Apellidos del alumno
  * @param  Edad edad del alumno
  * @param Curso curso del alumno
  * @param Email email del alumno
  * @param Telefono telefono del alumno
  * @param Notamedia notamedia del alumno*/

    public Alumnos(String Nombre, String Apellido, int Edad, String Curso,
                   String Dni, String Email, String Telefono, double Notamedia) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Curso = Curso;
        this.Dni = Dni;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Notamedia = Notamedia;
    }

    /** getter de nombre */

    public String getNombre(){
        return Nombre;
    }
/** setter de nombre */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
/** getter de apellido */
    public String getApellido() {
        return Apellido;
    }
/** setter de apellido */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
/** getter de edad */
    public int getEdad() {
        return Edad;
    }
/** setter de edad */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
/** getter de curso */
    public String getCurso() {
        return Curso;
    }
/** setter de curso */
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
/** getter de dni */
    public String getDni() {
        return Dni;
    }
/** setter de dni */
    public void setDni(String Dni) {
        this.Dni = Dni;
    }
/** getter de email */
    public String getEmail() {
        return Email;
    }
/** setter de email */
    public void setEmail(String Email) {
        this.Email = Email;
    }
/** getter de telefono */
    public String getTelefono() {
        return Telefono;
    }
/** setter de telefono */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
/** getter de notamedia */
    public double getNotamedia() {
        return Notamedia;
    }
/** setter de notamedia */
    public void setNotamedia(double Notamedia) {
        this.Notamedia = Notamedia;
    }

    /** metodo estatico para comprobar si es mayor de edad */
    public static boolean esMayorDeEdad(int Edad) {
        return Edad >= 18;
    }
    /** metodo estatico para comprobar si la nota media es aprobada */
    public static boolean notaAprobada(double Notamedia) {
        return Notamedia >= 5.0;
    }
}
