public class MetodosLinkedList {
    private Nodopelicula head;
    private int tamaño;

    public void Listaligada() {
        this.head = null;
        this.tamaño = 0;
    }

    public void agregarfinal(ObjPelicula p){
        Nodopelicula nuevonodo = new Nodopelicula(p);
        if(head == null){
        head = nuevonodo;
        }
        else{
            Nodopelicula actual = head;
            while(actual.siguiente!=null){
                actual=actual.siguiente;
            }
        }
    }



}
