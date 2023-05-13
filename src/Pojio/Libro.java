package Pojio;

public class Libro {
        private int ISBN;
        private String titulo;
        private String autor;
        private String estado;
        private int numEjemplares;

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getISBN() {
            return ISBN;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getEstado() {
            return estado;
        }

        public int getNumEjemplares() {
            return numEjemplares;
        }
    }


