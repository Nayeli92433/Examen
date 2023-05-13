package Principal;

import Pojio.Alumno;
import Pojio.Libro;
import Pojio.Profesor;
import Prestamo.SolicitarPrestamo;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidarRegistro {
    Scanner scanner= new Scanner(System.in);
    private ArrayList<Alumno> alumnos;
    private ArrayList <Profesor>profesor;
    private ArrayList<Libro>libros;
    SolicitarPrestamo solicitar = new SolicitarPrestamo(libros);

    public ValidarRegistro(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesor) {
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public void validarRegistro(){
        System.out.println("Ingresa tu nombre para verificar tu registro");
        String nombre= scanner.next();
        for (Alumno  alumno: alumnos) {
            if(alumno.getNombre().equals(nombre)){
                System.out.println("-------------------------");
                System.out.println("[1].-Solicitar Prestamo");
                int op= scanner.nextInt();
                switch (op){
                    case 1:
                        solicitar.solicitarPrestamo();
                        break;

                }
            }
        }
        for (Profesor  profesor1: profesor) {
            if(profesor1.getNombre().equals(nombre)){
                System.out.println("-------------------------");
                System.out.println("[1].-Solicitar Prestamo");
                int op= scanner.nextInt();
                switch (op){
                    case 1:
                        solicitar.solicitarPrestamo();
                        break;

                }
            }
        }

    }
}
