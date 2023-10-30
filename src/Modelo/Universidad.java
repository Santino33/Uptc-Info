package Modelo;

import java.util.HashMap;

public class Universidad implements IUniversidad{

    public HashMap<String, Estudiante> hashEstudiantes;
    public HashMap<String, Administrativo> hashAdministrativos;

    public Universidad() {
        hashEstudiantes = new HashMap<String, Estudiante>();
        hashAdministrativos = new HashMap<String, Administrativo>();
    }



    public HashMap<String, Estudiante> getHashEstudiantes() {
        return hashEstudiantes;
    }

    public void setHashEstudiantes(HashMap<String, Estudiante> hashEstudiantes) {
        this.hashEstudiantes = hashEstudiantes;
    }

    public HashMap<String, Administrativo> getHashAdministrativos() {
        return hashAdministrativos;
    }

    public void setHashAdministrativos(HashMap<String, Administrativo> hashAdministrativos) {
        this.hashAdministrativos = hashAdministrativos;
    }









    @Override
    public void crearEstudiante(String cedula, String contrasena, Estudiante estudiante) {
        String clave = cedula+","+contrasena;
        hashEstudiantes.put(clave, estudiante);
    }

    @Override
    public void crearAdministrativo(String cedula, String contrasena, Administrativo administrativo) {
        String clave = cedula+","+contrasena;
        hashAdministrativos.put(clave, administrativo);
    }

    @Override
    public Estudiante getEstudiante(String cedula, String contrasena) {
        Estudiante estudiante = hashEstudiantes.get(cedula+","+contrasena);
        return estudiante;
    }

    @Override
    public Administrativo getAdministrativo(String cedula, String contrasena) {
        Administrativo admin = hashAdministrativos.get(cedula+","+contrasena);
        return admin;
    }
}
