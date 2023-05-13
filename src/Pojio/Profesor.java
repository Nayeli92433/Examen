package Pojio;

public class Profesor extends Usuario{
    private String instituto;
    private String areaAdscripcion;

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public void setAreaAdscripcion(String areaAdscripcion) {
        this.areaAdscripcion = areaAdscripcion;
    }

    @Override
    public void setNumUsuario(int numUsuario) {
        super.setNumUsuario(numUsuario);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
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

    public String getInstituto() {
        return instituto;
    }

    public String getAreaAdscripcion() {
        return areaAdscripcion;
    }
}
