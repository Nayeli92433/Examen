package Principal;

import Mostrar.Mostrar;
import Pojio.Alumno;
import Pojio.Libro;
import Pojio.Profesor;
import Registros.Registros;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    Scanner scanner= new Scanner(System.in);
    ArrayList<Alumno> alumnos= new ArrayList<Alumno>();
    ArrayList<Profesor> profesores= new ArrayList<Profesor>();
    ArrayList<Libro> libros= new ArrayList<Libro>();
    Registros registros = new Registros(alumnos, profesores, libros);
    Mostrar mostrar= new Mostrar(alumnos,profesores);
    ValidarRegistro validar = new ValidarRegistro(alumnos,profesores);
    public void principal(){

        int op;
        do {
            System.out.println("----------BIBLIOTECA----------");
            System.out.println("[1].-Registrar Usuario\n[2].-Mostrar Registros\n[3].-Operaciones Usuario\n[4].-Registrar Libro\n[5].-Operaciones Biblioteca\n[6].-Salir");
            op= scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("----------BIBLIOTECA----------");
                    System.out.println("ingresa un registro de tipo");
                    System.out.println("-profesor\n-alumno\n");
                    String usuario= scanner.next();
                    if (usuario.equals("alumno")){
                       registros.registrarAlumno();

                    } else if (usuario.equals("profesor")) {
                        registros.registrarProfesor();
                    }
                    break;
                case 2:
                    if(alumnos.isEmpty()) {
                        System.out.println("NO HAY DATOS DE ALUMNOS");
                    }else {
                        mostrar.mostrarAlumnos();
                    }
                    if(profesores.isEmpty()) {
                        System.out.println("NO HAY DATOS DE PROFESORES");
                    }else {
                        mostrar.mostrarProfesores();
                    }
                    break;
                case 3:
                    validar.validarRegistro();
                    break;
                case 4:

                    registros.registrarLibro();
                    break;
                case 5:

                    break;
                default:
                    break;
            }
        }while (op!=6);

    }
}
