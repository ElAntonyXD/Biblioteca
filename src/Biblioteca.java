import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Programando en java", "Antony Perez", 150, 20);
        Libro libro2 = new Libro("La magia de practicar", "Tomy De La Garza", 400, 50);

        Scanner Leer = new Scanner(System.in);
        int opcion;
        boolean salir = true;

        try {
            do {
                System.out.println("menú de opciones:");
                System.out.println("1.Mostrar la informacion de un libro");
                System.out.println("2.Prestar un libro");
                System.out.println("3.Devolver un libro");
                System.out.println("4.Salir");

                System.out.println("");

                System.out.println("Seleccione una opcion:");

                opcion = Leer.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarInformacionLibro(Leer, libro1, libro2);
                        break;

                    case 2:
                        prestarLibro(Leer, libro1, libro2);
                        break;

                    case 3:
                        devolverLibro(Leer, libro1, libro2);
                        break;

                    case 4:
                        System.out.println("Saliendo del programa;");
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion que usted ha ingresado es invalida, intentelo de nuevo.");
                        break;
                }

            } while (salir);
        } catch (Exception e) {

        }
    }

    public static void mostrarInformacionLibro(Scanner scanner, Libro... libros) {
        System.out.print("Ingrese el título del libro: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un libro con ese título.");
        }
    }

    public static void prestarLibro(Scanner scanner, Libro... libros) {
        System.out.print("Ingrese el título del libro a prestar: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestarLIbro();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un libro con ese título.");
        }
    }

    public static void devolverLibro(Scanner scanner, Libro... libros) {
        System.out.print("Ingrese el título del libro a devolver: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();

        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolverLibro();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un libro con ese título.");
        }
    }

}
