package Modelo;

public interface IUniversidad {
    public void crearEstudiante(String cedula, String contrasena, Estudiante estudiante);
    public void crearAdministrativo(String cedula, String contrasena, Administrativo administrativo);
    public Estudiante getEstudiante(String cedula, String contrasena);
    public Administrativo getAdministrativo(String cedula, String contrasena);
}
