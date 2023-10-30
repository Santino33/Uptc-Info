package Modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private int semestre;
    private int edad;
    private String genero;
    private int materiasEnCurso;

    public Estudiante(String nombre, String apellido, String cedula, int semestre, int edad, String genero, int materiasEnCurso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.semestre = semestre;
        this.edad = edad;
        this.genero = genero;
        this.materiasEnCurso = materiasEnCurso;
    }

    public Estudiante() {
    }

    public String getNombre() {
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getMateriasEnCurso() {
        return materiasEnCurso;
    }

    public void setMateriasEnCurso(int materiasEnCurso) {
        this.materiasEnCurso = materiasEnCurso;
    }
}
