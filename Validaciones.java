import java.util.Scanner;

public class Validaciones {
    
    public int ValidarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Ingrese una opcion valida");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int opt, Scanner sc){
        Validaciones v = new Validaciones();
        while (opt < n1 || opt > n2 ) {
            System.out.println("Ingrese un rango de: " + n1 + " hasta " + n2);
            opt = v.ValidarEntero(sc);
        }
        return opt;
    }
}