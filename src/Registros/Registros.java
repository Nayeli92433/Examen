package Registros;

import Pojio.Alumno;
import Pojio.Libro;
import Pojio.Profesor;
import Pojio.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Registros extends Alumno{
    Scanner scanner= new Scanner(System.in);
    private ArrayList <Alumno> alumnos;
    private ArrayList <Profesor>profesor;
    private ArrayList<Libro>libros;

    public Registros(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesor, ArrayList<Libro> libros) {
        this.alumnos = alumnos;
        this.profesor = profesor;
        this.libros = libros;
    }

    public void registrarAlumno( ){

        Alumno alumno1= new Alumno();

        System.out.println("------------------------------");
        System.out.println("Ingresa el nombre ");
        alumno1.setNombre(scanner.next());
        System.out.println("Ingresa el apellido ");
        alumno1.setApellido(scanner.next());
        System.out.println("Ingresa la edad");
        alumno1.setEdad(scanner.nextInt());
        System.out.println("Ingresa la direccion ");
        alumno1.setDireccion(scanner.next());
        System.out.println("Ingresa el telefono ");
        alumno1.setTelefono(scanner.nextInt());
        System.out.println("Ingresa el correo ");
        alumno1.setCorreo(scanner.next());
        System.out.println("Ingresa el semestre ");
        alumno1.setSemestre(scanner.next());
        System.out.println("Ingresa la matricula ");
        alumno1.setMatricula(scanner.nextInt());
        System.out.println("Ingresa la carrera");
        alumno1.setCarrera(scanner.next());
        alumnos.add(alumno1);
    }

    public void registrarProfesor(){
        Profesor profesor1= new Profesor();

        System.out.println("------------------------------");
        System.out.println("Ingresa el nombre ");
        profesor1.setNombre(scanner.next());
        System.out.println("Ingresa el apellido ");
        profesor1.setApellido(scanner.next());
        System.out.println("Ingresa la edad");
        profesor1.setEdad(scanner.nextInt());
        System.out.println("Ingresa la direccion ");
        profesor1.setDireccion(scanner.next());
        System.out.println("Ingresa el telefono ");
        profesor1.setTelefono(scanner.nextInt());
        System.out.println("Ingresa el correo ");
        profesor1.setCorreo(scanner.next());
        System.out.println("Ingresa el instituto ");
        profesor1.setInstituto(scanner.next());
        System.out.println("Ingresa la area adscripcion ");
        profesor1.setAreaAdscripcion(scanner.next());
        profesor.add(profesor1);
        }
    public void registrarLibro(){
        Libro libro= new Libro();

        System.out.println("Ingresa el ISBN");
        libro.setISBN(scanner.nextInt());
        System.out.println("Ingresa el Titulo");
        libro.setEstado(scanner.next());
        System.out.println("Ingresa el Autor");
        libro.setAutor(scanner.next());
        System.out.println("Ingresa el numero de ejemplares");
        libro.setNumEjemplares(scanner.nextInt());
        libros.add(libro);
        }
    }

