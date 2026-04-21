import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    // Visitar página (push)
    public Stack<ObjPaginaWeb> visitarPagina(Stack<ObjPaginaWeb> pila) {

        String url;
        String titulo;

        System.out.println("-------------------------");
        System.out.print("Ingrese la URL: ");
        url = sc.nextLine();
 
        System.out.print("Ingrese el título: ");
        titulo = sc.nextLine();

        // Crea un objeto de tipo página web.
        ObjPaginaWeb pagina = new ObjPaginaWeb(url, titulo, 0);

        pila.push(pagina);

        return pila;
    }

    public Stack<ObjPaginaWeb> retroceder(Stack<ObjPaginaWeb> pila) {

        // Validación: solo cuando intentan retroceder sin páginas.
        if (pila.isEmpty()) {
            System.out.println("-------------------------");
            System.out.println("No hay páginas para retroceder.");
            System.out.println("-------------------------");

            return pila;
        }

        // Elimina la página actual
        ObjPaginaWeb eliminada = pila.pop();

        System.out.println("-------------------------");
        System.out.println("Se cerró: " + eliminada.getTitulo());
        System.out.println("-------------------------");

        // Se muestra la página actual si aún hay elementos.
        if (!pila.isEmpty()) {
            ObjPaginaWeb actual = pila.peek();

            System.out.println("----- Página actual -----");
            System.out.println("Título: " + actual.getTitulo());
            System.out.println("URL: " + actual.getUrl());
            System.out.println("-------------------------");
        }

        return pila;

    }

    public void verHistorial(Stack<ObjPaginaWeb> pila) {

        // Verifica si la pila está vacía.
        if (pila.isEmpty()) {
            System.out.println("No hay historial");

            return;

        }

        System.out.println("----- VER HISTORIAL -----");

        // Recorre la pila desde la más reciente hasta la más antigua.
        for (int i = pila.size() - 1; i >= 0; i--) {

            ObjPaginaWeb p = pila.get(i);

            System.out.println("Título: " + p.getTitulo());
            System.out.println("URL: " + p.getUrl());
            System.out.println("-------------------------");
        }
    }
}
