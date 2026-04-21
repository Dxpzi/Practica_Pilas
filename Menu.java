import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Validaciones v = new Validaciones();
        Metodos m = new Metodos();

        Stack<ObjPaginaWeb> pila = new Stack<>();

        boolean seguir = true;
        int opt = 0;

        while (seguir) {

            System.out.println("----- NAVEGADOR WEB -----");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver historial");
            System.out.println("4. Salir");
            System.out.println("-------------------------");
            System.out.print("Ingrese la opción deseada: ");

            opt = v.ValidarEntero(sc);
            sc.nextLine();

            switch (opt) {
                case 1:
                    pila = m.visitarPagina(pila);
                    break;
                case 2:
                    pila = m.retroceder(pila);
                    break;
                case 3:
                    m.verHistorial(pila);
                    break;
                case 4:
                    seguir = false;
                    System.out.println("-------------------------");
                    System.out.println("Saliendo...");
                    System.out.println("-------------------------");
                    break;

                default:
                    System.out.println("-------------------------");
                    System.out.println("Opción no válida");
                    System.out.println("-------------------------");
                    break;
            }

        }
    }

}
