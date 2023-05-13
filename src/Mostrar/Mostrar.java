package Mostrar;

import Pojio.Alumno;
import Pojio.Profesor;

import java.util.ArrayList;

public class Mostrar {
    private ArrayList<Alumno> alumnos;
    private ArrayList <Profesor>profesor;

    public Mostrar(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesor) {
        super();
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public void mostrarAlumnos(){
        for (Alumno alumno: alumnos) {
            System.out.println("Nombre: "+alumno.getNombre() + alumno.getApellido());
            System.out.println("Direccion: "+alumno.getDireccion());
            System.out.println("Edad: "+alumno.getEdad());
            System.out.println("Telefono: "+alumno.getTelefono());
            System.out.println("Correo: "+alumno.getCorreo());
            System.out.println("Tipo de usuario: "+alumno.getTipoUsuario());
            System.out.println("Carrera: "+alumno.getCarrera());
            System.out.println("Semestre: "+alumno.getSemestre());
            System.out.println("Matricula: "+alumno.getMatricula());
        }
    }
    public void mostrarProfesores(){
        for (Profesor profesor1: profesor) {
            System.out.println("Nombre: "+profesor1.getNombre() + profesor1.getApellido());
            System.out.println("Direccion: "+profesor1.getDireccion());
            System.out.println("Edad: "+profesor1.getEdad());
            System.out.println("Telefono: "+profesor1.getTelefono());
            System.out.println("Correo: "+profesor1.getCorreo());
            System.out.println("Tipo de usuario: "+profesor1.getTipoUsuario());
            System.out.println("Instituco: "+profesor1.getInstituto());
            System.out.println("Area: "+profesor1.getAreaAdscripcion());
        }
    }
}
