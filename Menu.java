import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        boolean bandera = true;

        while(bandera){
        System.out.println("--- REPRODUCTOR ---");
        System.out.println("1. Agregar canción");
        System.out.println("2. Eliminar canción");
        System.out.println("3. Ver Playlist completa");
        System.out.println("4. Siguiente >>>");
        System.out.println("5. <<< Anterior");
        System.out.println("6. Ver qué suena ahora");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
        int opt = v.ValidarEntero(sc);
        v.ValidarRango(1, 7, opt, sc);

        switch (opt) {
            case 1:
                System.out.println("Nombre del Artista: ");
                String Art = sc.next();
                System.out.println("Nombre de la cancion: ");
                String Tit = sc.next();
                m.Agregar(Art, Tit);
                break;

            case 2:
                System.out.println("Nombre de la cancion a eliminar ");
                String tit = sc.next();
                System.out.println(m.Eliminar(tit));
                break;

            case 3:
                System.out.println("Desea ver la lista en reversa? \n 1) Si \n 2) No \nElija un numero");
                int op = v.ValidarEntero(sc);
                v.ValidarRango(1, 2, op, sc);

                if(op == 1 ){
                    m.MostrarAdelante();
                }

                else{
                    m.MostrarReversa();
                }
                break;

            case 4:
                m.ReproducirSiguiente();
                break;

            case 5:
                m.ReproducirAnterior();
                break;

            case 6:
                m.Estado();
                break;

            default:
                System.out.println("ADIOS");
                bandera = false;
                break;
        }
    }
    }
}