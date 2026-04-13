public class Nodo{
       Cancion dato;
       Nodo siguiente;
       Nodo anterior; 

    public Nodo(Cancion cancion){
        this.dato = cancion;
        this.siguiente = null;
        this.anterior = null;
    }
}