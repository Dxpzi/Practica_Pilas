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

        System.out.print("Ingrese el titulo: ");
        titulo = sc.nextLine();

        ObjPaginaWeb pagina = new ObjPaginaWeb(url, titulo, 0);

        pila.push(pagina);

        return pila;
    }

    // Retroceder (pop + peek)
    public Stack<ObjPaginaWeb> retroceder(Stack<ObjPaginaWeb> pila) {

        ObjPaginaWeb eliminada = pila.pop();

        System.out.println("Se cerró: " + eliminada.getTitulo());

        if (pila.isEmpty()) {
            System.out.println("-------------------------");
            System.out.println("No hay más páginas anteriores.");
            System.out.println("-------------------------");
        } else {
            ObjPaginaWeb actual = pila.peek();
            System.out.println("----- Página actual -----");
            System.out.println("Título: " + actual.getTitulo());
            System.out.println("URL: " + actual.getUrl());
        }

        return pila;

    }

    public void verHistorial(Stack<ObjPaginaWeb> pila) {

        if (pila.isEmpty()) {
            System.out.println("No hay historial");

            return;

        }

        System.out.println("----- VER HISTORIAL -----");

        for (int i = pila.size() - 1; i >= 0; i--) {
            ObjPaginaWeb p = pila.get(i);
            System.out.println("Título: " + p.getTitulo());
            System.out.println("URL: " + p.getUrl());
            System.out.println("-------------------------");
        }
    }
}
