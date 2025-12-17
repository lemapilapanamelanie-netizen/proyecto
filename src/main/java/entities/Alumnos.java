package entities;
//aqui estan los atributos privados

public class Alumnos {
    private  String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private String dni;
    private String email;
    private String telefono;
    private double notamedia;
 // constructor  vacio
    public Alumnos() {
    }
 // constructor con con parametros
    public Alumnos(String nombre, String apellido, int edad, String curso,
                   String dni, String email,String telefono, double notamedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.notamedia = notamedia;
    }
 // getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    // 2 metodos estaticos
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static boolean notaAprobada(double notamedia) {
        return notamedia >= 5.0;
    }

}
