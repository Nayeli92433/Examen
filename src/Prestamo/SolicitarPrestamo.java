package Prestamo;

import Pojio.Libro;
import Pojio.Profesor;

import java.util.ArrayList;

public class SolicitarPrestamo {
    private ArrayList<Libro> libros;

    public SolicitarPrestamo(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void solicitarPrestamo(){
        for (Libro libro1: libros) {
            System.out.println("ISBN: "+libro1.getISBN());
            System.out.println("Titulo: "+libro1.getTitulo());
            System.out.println("Autor: "+libro1.getAutor());
            System.out.println("Estado: "+libro1.getEstado());
            System.out.println("Ejemplares: "+libro1.getNumEjemplares());
        }
        System.out.println("Ingrese en nombre del libro que desea adquirir");

    }
}
