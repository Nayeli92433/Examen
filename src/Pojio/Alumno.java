package Pojio;

public class Alumno extends Usuario {
    private String semestre;
    private int matricula;
    private String carrera;


    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setNumUsuario(int numUsuario) {
        super.setNumUsuario(numUsuario);
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public void setCorreo(String correo) {
        super.setCorreo(correo);
    }

    @Override
    public void setTipoUsuario(String tipoUsuario) {
        super.setTipoUsuario(tipoUsuario);
    }

    public String getSemestre() {
        return semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }
}

