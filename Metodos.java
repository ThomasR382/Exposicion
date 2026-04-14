public class Metodos {
    private Nodo primero = null;
    private Nodo ultimo = null;
    private Nodo Reproduciendo;

    public void Agregar(String Artista, String Titulo){
        Cancion NuevaCancion = new Cancion(Artista, Titulo);
        Nodo NodoNuevo = new Nodo(NuevaCancion);

        if(primero == null){
            primero = NodoNuevo;
            ultimo = NodoNuevo;
            primero.siguiente = primero;
            primero.anterior = primero;
            Reproduciendo = NodoNuevo;
        }

        else{
            ultimo.siguiente = NodoNuevo;
            NodoNuevo.anterior = ultimo;
            NodoNuevo.siguiente = primero;
            primero.anterior = NodoNuevo;
            ultimo = NodoNuevo;
        }

        System.out.println(Titulo + " HA SIDO AGREGADA");
    }

    public String Eliminar(String Titulo){
        if (primero == null){
            return "No hay canciones en la lista";
        }

        Nodo actual = primero;

        do{
            if(actual.dato.Titulo.equalsIgnoreCase(Titulo)){
                if (actual == primero && actual == ultimo) {
                    primero = null;
                    ultimo = null;
                     
                }

                else{
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;

                    if (actual == primero) primero = actual.siguiente;
                    if (actual == ultimo) ultimo = actual.anterior;
                }
                return "La cancion "+ Titulo + " ha sido eliminada";
            }

            actual = actual.siguiente;

        }
        while(actual != primero);

        return "La cancion " + Titulo + " no está en la lista";
    }

    public void MostrarAdelante(){
        if (primero == null){
            System.out.println("No hay canciones en la lista ");
            return;
        }

        Nodo actual = primero;
        System.out.println("TU PLAYLIST");
        do {
            System.out.println("Artista: "+ actual.dato.Artista + "// Nombre de la cancion " + actual.dato.Titulo);
            actual = actual.siguiente;
        } 
        while(actual != primero);
    }

    public void MostrarReversa(){
        if (ultimo == null){
            System.out.println("No hay canciones en la lista ");
            return;
        }

        Nodo actual = ultimo;
        System.out.println("TU PLAYLIST EN REVERSA");

        do {
            System.out.println("Artista: "+ actual.dato.Artista + "// Nombre de la cancion " + actual.dato.Titulo);
            actual = actual.anterior;
        } 
        while(actual != ultimo);
    }

    public void ReproducirSiguiente(){
        if (Reproduciendo == null){
            System.out.println("No hay canciones en la lista ");
            return;
        }
        Reproduciendo = Reproduciendo.siguiente;
        Estado();
        
    }

    public void Estado(){
        if(Reproduciendo == null){
            System.out.println("La playlist está vacia.");
        }

        else{
            System.out.println("--------------------------------------------------------");
            System.out.println("CANCION ANTERIOR: " + Reproduciendo.anterior.dato.Titulo);
            System.out.println("ARTISTA: " + Reproduciendo.anterior.dato.Artista);
            System.out.println("--------------------------------------------------------");
            System.out.println("CANCION ACTUAL: " + Reproduciendo.dato.Titulo);
            System.out.println("ARTISTA: " + Reproduciendo.dato.Artista);
            System.out.println("--------------------------------------------------------");
            System.out.println("CANCION SIGUIENTE: " + Reproduciendo.siguiente.dato.Titulo);
            System.out.println("ARTISTA: " + Reproduciendo.siguiente.dato.Artista);
            System.out.println("--------------------------------------------------------");
        }
    }

    public void ReproducirAnterior(){
        if (Reproduciendo == null){
            System.out.println("No hay canciones en la lista ");
            return;
        }
        Reproduciendo = Reproduciendo.anterior;
        Estado();
    }
}
