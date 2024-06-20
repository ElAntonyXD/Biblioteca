public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int numeroEjemplares;

    public Libro(String titulo, String autor, int numeroPaginas, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getNumeroEmjemplares() {
        return numeroEjemplares;
    }

    public void prestarLIbro() {
        if (numeroEjemplares > 0) {
            numeroEjemplares--;
            System.out.println("Se ha prestado el libro: " + titulo + ". Ejemplares disponibles:" + numeroEjemplares);
        } else {
            System.out.println("No hay ejemplares disponibles para poder prestar.");
        }
    }

    public void devolverLibro() {
        numeroEjemplares++;
        System.out.println("Se ha devuleto el libro: " + titulo + ". Ejemplares disponibles: " + numeroEjemplares);
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
        System.out.println("Numero de ejemplares: " + numeroEjemplares);
    }

}
